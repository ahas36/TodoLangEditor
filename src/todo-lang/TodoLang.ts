import * as monaco from "monaco-editor-core";
import IRichLanguageConfiguration = monaco.languages.LanguageConfiguration;
import ILanguage = monaco.languages.IMonarchLanguage;

export const richLanguageConfiguration: IRichLanguageConfiguration = {
    // If we want to support code folding, brackets ... ( [], (), {}....), we can override some properties here
    // check the doc
};

export const monarchLanguage =  (parameters:string[]) => 
{
    return <ILanguage>{
        // Set defaultToken to invalid to see what you do not tokenize yet
        defaultToken: 'invalid',
        keywords: [
            'v1','v2','v3','v4'
        ],
        typeKeywords: ['avg', 'sum', 'min', 'max',],
        escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,
        // The main tokenizer for our languages
        tokenizer: {
            root: [
                // identifiers and keywords
                [/[a-zA-Z_$][\w$]*/i, {
                    cases: {
                        '@keywords': { token: 'keyword' },
                        '@typeKeywords': { token: 'type' },
                        '@default': 'identifier'
                    }
                }],
                // whitespace
                { include: '@whitespace' },
                // strings for todos
                [/"([^"\\]|\\.)*$/, 'string.invalid'],  // non-teminated string
                [/"/, 'string', '@string'],
            ],
            whitespace: [
                [/[ \t\r\n]+/, ''],
            ],
            string: [
                [/[^\\"]+/, 'string'],
                [/@escapes/, 'string.escape'],
                [/\\./, 'string.escape.invalid'],
                [/"/, 'string', '@pop']
            ],
            number: [
                [/\d+"]+/, 'number'],
                [/\d+.\d+/, 'string.double'],
            ]
        },
    }
}
