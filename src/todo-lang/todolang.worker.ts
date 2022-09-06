import * as worker from 'monaco-editor-core/esm/vs/editor/editor.worker';
import { TodoLangWorker } from './todoLangWorker';

self.onmessage = (ev: any) => {
	worker.initialize((ctx) => {
		return new TodoLangWorker(ctx)
	});
};
