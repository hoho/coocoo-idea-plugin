package com.hoho.coocoo;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static com.hoho.coocoo.psi.CoocooTypes.*;

%%

%class _CoocooLexer
%abstract
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{ return;
%eof}

%{
  _CoocooLexer() {
    this((java.io.Reader)null);
  }

  public final void setStart(int start) {
    zzCurrentPos = zzStartRead = start;
  }

  protected abstract void readJavaScript(int state) throws java.io.IOException;
  protected abstract void readMultilineJavaScript(int state) throws java.io.IOException;
%}


CRLF = (\r|\n|\r\n)+
WHITE_SPACE = [\ \t\f]+
IDENTIFIER = [a-zA-Z_][a-zA-Z0-9_]*
STRING = \"([^\"\r\n\\]|\\.)*\" | '([^'\r\n\\]|\\.)*'

DOM = "CLICK"|"DBLCLICK"|"MOUSEDOWN"|"MOUSEUP"|"MOUSEOVER"|"MOUSEMOVE"|"MOUSEOUT"|"DRAGSTART"|"DRAG"|"DRAGENTER"|"DRAGLEAVE"|"DRAGOVER"|"DROP"|"DRAGEND"|"KEYDOWN"|"KEYPRESS"|"KEYUP"|"LOAD"|"UNLOAD"|"ABORT"|"ERROR"|"RESIZE"|"SCROLL"|"SELECT"|"CHANGE"|"INPUT"|"SUBMIT"|"RESET"|"FOCUS"|"BLUR"|"FOCUSIN"|"FOCUSOUT"
KEYWORD = "APPLICATION"|"MODEL"|"COLLECTION"|"VIEW"|"CONSTRUCT"|"DOM"|"DESTRUCT"|"PROPERTY"|"METHOD"|"DESTROY"|"THIS"|"SET"|"GET"|"TEXT"|"TEMPLATE"|"PARAM"|"APPLY"|"APPEND"|"RENDER"|"VALUE"|"CLASS"|"CREATE"|"REMOVE"|"TOGGLE"|"CALL"|"TEST"|"CHOOSE"|"WHEN"|"OTHERWISE"|"AJAX"|"TRIGGER"|"ROUTE"|"PATHNAME"|"HASH"|"QUERYSTRING"|"URL"|"POST"|"TYPE"|"DATA"|"SUCCESS"|"ERROR"|"COMPLETE"|{DOM}
COMMENT = [\ \t\f]* ("//" [^\r\n]*) [\ \t\f]*

PUSHER = "+"
SUBCOOCOO_BEGIN = "["
SUBCOOCOO_END = "]"
VARIABLE_GETTER = "$"
PROPERTY_GETTER = "@"
TYPIFICATION_BEGIN = "<"
TYPIFICATION_END = "<"

JAVASCRIPT = . | {WHITE_SPACE} | {CRLF} | {COMMENT} | {STRING} | {KEYWORD} | {PUSHER} | {SUBCOOCOO_BEGIN} | {SUBCOOCOO_END} | {VARIABLE_GETTER} | {PROPERTY_GETTER} | {TYPIFICATION_BEGIN} | {TYPIFICATION_END}


%state IN_JAVASCRIPT
%state IN_JAVASCRIPT2
%state AFTER
%state GETTER
%state IN_BAD

%%

                     {COMMENT}                       { return COMMENT; }
<IN_BAD>             [^\r\n]+                        { return com.intellij.psi.TokenType.BAD_CHARACTER; }

<YYINITIAL>          "+"                             { return PUSHER; }
<YYINITIAL>          "["                             { return SUBCOOCOO; }
<YYINITIAL, AFTER>   "]"                             { yybegin(AFTER); return SUBCOOCOO; }

<YYINITIAL>          "$"                             { yybegin(GETTER); return VARIABLE_GETTER; }
<YYINITIAL>          "@"                             { yybegin(GETTER); return PROPERTY_GETTER; }
<YYINITIAL, AFTER>   "<"                             { yybegin(YYINITIAL); return TYPIFICATION; }
<YYINITIAL, AFTER>   ">"                             { yybegin(AFTER); return TYPIFICATION; }

<YYINITIAL>          {STRING}                        { yybegin(AFTER); return STRING; }

<IN_JAVASCRIPT>      {JAVASCRIPT}                    { yybegin(IN_JAVASCRIPT2); readJavaScript(AFTER); return JAVASCRIPT; }
<IN_JAVASCRIPT2>     {JAVASCRIPT}                    { return JAVASCRIPT; }
<YYINITIAL>          "("                             { yybegin(IN_JAVASCRIPT); return JAVASCRIPT_BEGIN; }
                     ")"                             { return JAVASCRIPT_END; }

<YYINITIAL>          "JS"                            { yybegin(IN_JAVASCRIPT2); readMultilineJavaScript(YYINITIAL); return KEYWORD; }

<YYINITIAL>          {KEYWORD}                       { yybegin(AFTER); return KEYWORD; }
<GETTER>             {IDENTIFIER}                    { yybegin(AFTER); return VARIABLE; }
<YYINITIAL>          {IDENTIFIER}                    { yybegin(AFTER); return IDENTIFIER; }

                     {CRLF}                          { yybegin(YYINITIAL); return CRLF; }
                     {WHITE_SPACE}                   { yybegin(YYINITIAL); return WHITE_SPACE; }
                     .                               { yybegin(IN_BAD); return com.intellij.psi.TokenType.BAD_CHARACTER; }
