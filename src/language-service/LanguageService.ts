import { ExpressionContext, FunctionNameContext, ParameterContext } from "../ANTLR/ExpressionGrammarParser";
import { parseAndGetASTRoot, parseAndGetSyntaxErrors } from "./Parser";
import { IError } from "./ErrorListener";
import { ParserRuleContext } from "antlr4ts";
import { ParseTree } from "antlr4ts/tree/ParseTree";

export default class LanguageService {
    validate(code: string, parameters: string[]): IError[] {
        const syntaxErrors: IError[] = parseAndGetSyntaxErrors(code);
        const ast: ExpressionContext = parseAndGetASTRoot(code);
        return syntaxErrors.concat(checkSemanticRules(ast, parameters));
    }
    format(code: string, parameters: string[]): string {
        // if the code contains errors, no need to format, because this way of formating the code, will remove some of the code
        // to make things simple, we only allow formatting a valide code
        if (this.validate(code, parameters).length > 0)
            return code;
        let formattedCode = "";
        const ast: ExpressionContext = parseAndGetASTRoot(code);
        ast.children.forEach(node => {
            debugger;
        });
        return formattedCode;
    }
}

function checkSemanticRules(node: ParseTree, parameters: string[]): IError[] {
    debugger;
    let errors: IError[] = [];
    const functions: string[] = ["avg", "min", "max", "sum"];
    if (node instanceof FunctionNameContext) {
        const name = node.text;
        if (functions.findIndex(v => v == name) == -1) {
            errors.push({
                code: "2",
                endColumn: node.stop.charPositionInLine + name.length + 1,
                endLineNumber: node.stop.line,
                message: `${name} is not a valid function`,
                startColumn: node.stop.charPositionInLine + 1,
                startLineNumber: node.stop.line
            })
        }

    } else if (node instanceof ParameterContext) {

        const name = node.text;
        if (Array.isArray(parameters) && parameters.findIndex(v => v == name) == -1) {
            errors.push({
                code: "3",
                endColumn: node.stop.charPositionInLine + name.length + 1,
                endLineNumber: node.stop.line,
                message: `${name} is not a valid parameter`,
                startColumn: node.stop.charPositionInLine + 1,
                startLineNumber: node.stop.line
            })
        }
    } else {
        if (node.childCount > 0) {
            for (var i = 0; i < node.childCount; i++) {
                const tempErrors = checkSemanticRules(node.getChild(i), parameters);
                errors = errors.concat(tempErrors);
            }

        }
    }
    return errors;
}

