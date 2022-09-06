import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {setupLanguage} from "./todo-lang/setup";
import Editor from './components/Editor/Editor';
import { languageID } from './todo-lang/config';
import { parseAndGetSyntaxErrors, parseAndGetASTRoot } from './language-service/Parser';

const App = () => <Editor value='avg(12,14,15)' onChange={()=>{}} language={languageID} parameters={["v1","v2","v3"]}></Editor>;

ReactDOM.render(<App/>, document.getElementById('container'));