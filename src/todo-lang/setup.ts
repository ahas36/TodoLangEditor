import * as monaco from "monaco-editor-core";
import { languageExtensionPoint, languageID } from "./config";
import { richLanguageConfiguration, monarchLanguage } from "./TodoLang";
import { TodoLangWorker } from "./todoLangWorker";
import { WorkerManager } from "./WorkerManager";
import DiagnosticsAdapter from "./DiagnosticsAdapter";
import TodoLangFormattingProvider from "./TodoLangFormattingProvider";

export function setupLanguage(parameters?:string[]) {
    (window as any).MonacoEnvironment = {
        getWorkerUrl: function (moduleId, label) {
            if (label === languageID)
                return "./todoLangWorker.js";
            return './editor.worker.js';
        }
    }
    monaco.languages.register(languageExtensionPoint);
    monaco.languages.onLanguage(languageID, () => {
        monaco.languages.setMonarchTokensProvider(languageID, monarchLanguage(parameters));

        monaco.languages.registerCompletionItemProvider(languageID, {
            //@ts-ignore
            provideCompletionItems: () => {
              var suggestions = [
                {
                  label: 'Average',
                  kind: monaco.languages.CompletionItemKind.Function,
                  insertText: 'avg(${1:field1},${2:field2})',
                  insertTextRules: monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet
                },
                {
                  label: 'Sum',
                  kind: monaco.languages.CompletionItemKind.Function,
                  insertText: 'sum(${1:field1},${2:field2})',
                  insertTextRules: monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet
                },
                {
                  label: 'Min',
                  kind: monaco.languages.CompletionItemKind.Function,
                  insertText: 'min(${1:field1},${2:field2})',
                  insertTextRules: monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet
                },
                {
                  label: 'Max',
                  kind: monaco.languages.CompletionItemKind.Function,
                  insertText: 'max(${1:field1},${2:field2})',
                  insertTextRules: monaco.languages.CompletionItemInsertTextRule.InsertAsSnippet
                },
              ];
              for (var item of parameters) {
                suggestions.push({
                  label: item,
                  kind: monaco.languages.CompletionItemKind.Variable,
                  insertText: item,
                  insertTextRules: monaco.languages.CompletionItemInsertTextRule.KeepWhitespace
                })
              }
              return { suggestions: suggestions };
            }
          });

        monaco.languages.setLanguageConfiguration(languageID, richLanguageConfiguration);
        const client = new WorkerManager();

        const worker: WorkerAccessor = (...uris: monaco.Uri[]): Promise<TodoLangWorker> => {
            return client.getLanguageServiceWorker(parameters,...uris);
        };
        //Call the errors provider
        new DiagnosticsAdapter(worker);
        monaco.languages.registerDocumentFormattingEditProvider(languageID, new TodoLangFormattingProvider(worker));
    });

}

export type WorkerAccessor = (...uris: monaco.Uri[]) => Promise<TodoLangWorker>;