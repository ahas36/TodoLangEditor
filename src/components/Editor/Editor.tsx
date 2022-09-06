import * as React from 'react';
import * as monaco from 'monaco-editor-core';
import { setupLanguage } from '../../todo-lang/setup';

interface IEditorPorps {
    value: string,
    onChange: (value: string) => void,
    language: string;
    parameters: string[]
}

const Editor: React.FC<IEditorPorps> = ({ value, onChange, language, parameters }: IEditorPorps) => {
    let divNode;
    const assignRef = React.useCallback((node) => {
        // On mount get the ref of the div and assign it the divNode
        divNode = node;
    }, []);

    React.useEffect(() => {
        if (divNode) {
            
            globalThis.parameters=parameters;
            setupLanguage(parameters);
            const editor = monaco.editor.create(divNode, {
                value,
                language: language,
                minimap: { enabled: false },
                autoIndent: true,
                wordWrap: 'off',
                lineHeight: 24,
                fontSize: 16,
                lineNumbers: 'off',
                lineNumbersMinChars: 0,
                overviewRulerLanes: 0,
                overviewRulerBorder: false,
                autoClosingBrackets: 'always',
                autoSurround: 'brackets',
                autoClosingQuotes: 'always',
                lineDecorationsWidth: 0,
                hideCursorInOverviewRuler: true,
                glyphMargin: false,
                folding: false,
                contextmenu: false,
                scrollBeyondLastColumn: 0,

                scrollbar: { horizontal: 'hidden', vertical: 'hidden', handleMouseWheel: false, },
            });



            editor.onDidChangeModelContent((e: any) => {
                let value = editor.getValue();
                if (value != null) {
                    var tmp = value.replace(/[\n\r]/g, '');
                    onChange(tmp);
                    if (tmp != value)
                        editor.setValue(tmp)
                }
            });

        }
    }, [assignRef])

    return <div ref={assignRef} style={{ height: '48px', }}></div>;
}

export default Editor;