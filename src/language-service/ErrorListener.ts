import { ANTLRErrorListener, RecognitionException, Recognizer } from "antlr4ts";


export interface IError {
    startLineNumber: number;
    startColumn: number;
    endLineNumber: number;
    endColumn: number;
    message: string;
    code: string;
}

export default class ErrorListener implements ANTLRErrorListener<any>{
    private errors: IError[] = []
    syntaxError(recognizer: Recognizer<any, any>, offendingSymbol: any, line: number, charPositionInLine: number, message: string, e: RecognitionException | undefined): void {
        this.errors.push(
            {
                startLineNumber:line,
                endLineNumber: line,
                startColumn: charPositionInLine,
                endColumn: charPositionInLine+1,//Let's suppose the length of the error is only 1 char for simplicity
                message,
                code: "1" // This the error code you can customize them as you want
            }
        )
    }

    getErrors(): IError[] {
        return this.errors;
    }
}