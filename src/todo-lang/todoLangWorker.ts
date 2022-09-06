import * as monaco from "monaco-editor-core";

import IWorkerContext = monaco.worker.IWorkerContext;
import TodoLangLanguageService from "../language-service/LanguageService";
import { IError } from "../language-service/ErrorListener";


export class TodoLangWorker {

    private _ctx: IWorkerContext;
    private languageService: TodoLangLanguageService;
    private parameters: string[];
    constructor(ctx: IWorkerContext) {
        this._ctx = ctx;
        this.languageService = new TodoLangLanguageService();
    }

    setParameter(parameters: string[]) {
        this.parameters = parameters;
    }

    doValidation(): Promise<IError[]> {
        const code = this.getTextDocument();
        return Promise.resolve(this.languageService.validate(code, this.parameters));
    }
    format(code: string): Promise<string> {
        return Promise.resolve(this.languageService.format(code, this.parameters));
    }
    private getTextDocument(): string {
        const model = this._ctx.getMirrorModels()[0];// When there are multiple files open, this will be an array
        return model.getValue();
    }

}
