grammar ExpressionGrammar;

/*
 * Tokens (terminal)
 */
POW: '^';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
NUMBER: '-'?[0-9]+(.[0-9]+)?;
ID : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;
WHITESPACE: [ \r\n\t]+ -> skip;
LPAREN : '(';
COMMA : ',';
RPAREN : ')';

/*
 * Production Rules (non-terminal)
 */

expression : exp EOF ;

exp
   : variable                                             # Variables
   | '(' inner=exp ')'                             # Parentheses
   | left=exp operator=POW right=exp        # Power
   | left=exp operator=(MUL|DIV) right=exp  # MultiplicationOrDivision
   | left=exp operator=(ADD|SUB) right=exp  # AdditionOrSubtraction
   ;

variable
    : NUMBER
    | parameter
    |function;

function: functionName LPAREN (variable (COMMA variable)*)? RPAREN;

functionName: ID;

parameter: ID;

