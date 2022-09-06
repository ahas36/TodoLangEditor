import { ExpressionGrammarParser, ExpressionContext } from "../ANTLR/ExpressionGrammarParser";
import { ExpressionGrammarLexer } from "../ANTLR/ExpressionGrammarLexer";
import { ANTLRInputStream, CommonTokenStream } from "antlr4ts";
import ErrorListener, { IError } from "./ErrorListener";

export function parse(code: string): {ast:ExpressionContext, errors: IError[]} {
    const inputStream = new ANTLRInputStream(code);
    const lexer = new ExpressionGrammarLexer(inputStream);
    lexer.removeErrorListeners()
    const ErrorsListner = new ErrorListener();
    lexer.addErrorListener(ErrorsListner);
    const tokenStream = new CommonTokenStream(lexer);
    const parser = new ExpressionGrammarParser(tokenStream);
    parser.removeErrorListeners();
    parser.addErrorListener(ErrorsListner);
    const ast =  parser.expression();
    const errors: IError[]  = ErrorsListner.getErrors();
    return {ast, errors};
}
export function parseAndGetASTRoot(code: string): ExpressionContext {
    const {ast} = parse(code);
    return ast;
}
export function parseAndGetSyntaxErrors(code: string): IError[] {
    const {errors} = parse(code);
    return errors;
}