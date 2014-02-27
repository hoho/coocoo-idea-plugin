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

KEYWORD_WITH_CLASS = "model"|"collection"|"view"|"route"|"extends"
KEYWORD_WITH_NAME = "method"|"property"|"call"|"set"|"reset"|"get"
KEYWORD = "application"|"routes"|"construct"|"dom"|"destruct"|"destroy"|"this"|"text"|"template"|"param"|"apply"|"append"|"render"|"value"|"class"|"create"|"change"|"add"|"remove"|"toggle"|"test"|"choose"|"when"|"otherwise"|"ajax"|"trigger"|"pathname"|"hash"|"search"|"url"|"post"|"type"|"data"|"success"|"error"|"complete"|"on"|"off"|"extends"|"js"|"find"|"each"|"filter"|"attribute"|"length"|"form"|"serialize"|"nomatch"
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
%state CLASS
%state NAME
%state TYPE
%state IN_BAD

%%

                     {COMMENT}                       { return COMMENT; }
<IN_BAD>             [^\r\n]+                        { return com.intellij.psi.TokenType.BAD_CHARACTER; }

<YYINITIAL>          "+"                             { return PUSHER; }
<YYINITIAL,
 CLASS,
 NAME>               "["                             { yybegin(YYINITIAL); return SUBCOOCOO; }
<YYINITIAL,
 AFTER,
 CLASS,
 NAME>               "]"                             { yybegin(AFTER); return SUBCOOCOO; }

<YYINITIAL,
 CLASS,
 NAME>               "$"                             { yybegin(GETTER); return VARIABLE_GETTER; }

<YYINITIAL,
 CLASS,
 NAME>               "@"                             { yybegin(GETTER); return PROPERTY_GETTER; }

<YYINITIAL, AFTER>   "<"                             { yybegin(TYPE); return TYPIFICATION; }
<YYINITIAL, AFTER>   ">"                             { yybegin(AFTER); return TYPIFICATION; }
<TYPE>               "?"                             { yybegin(YYINITIAL); return NULLABLE; }

<YYINITIAL>          {STRING}                        { yybegin(AFTER); return STRING; }

<IN_JAVASCRIPT>      {JAVASCRIPT}                    { yybegin(IN_JAVASCRIPT2); readJavaScript(AFTER); return JAVASCRIPT; }
<IN_JAVASCRIPT2>     {JAVASCRIPT}                    { return JAVASCRIPT; }
<YYINITIAL,
 NAME>               "("                             { yybegin(IN_JAVASCRIPT); return JAVASCRIPT_BEGIN; }
                     ")"                             { return JAVASCRIPT_END; }

<YYINITIAL>          "js"                            { yybegin(IN_JAVASCRIPT2); readMultilineJavaScript(YYINITIAL); return KEYWORD; }

<YYINITIAL,
 TYPE>               {KEYWORD_WITH_CLASS}            { yybegin(CLASS); return KEYWORD; }
<YYINITIAL,
 TYPE>               {KEYWORD_WITH_NAME}             { yybegin(NAME); return KEYWORD; }
<YYINITIAL,
 TYPE>               {KEYWORD}                       { yybegin(AFTER); return KEYWORD; }

<CLASS>              {IDENTIFIER}                    { yybegin(AFTER); return COOCLASS; }
<NAME>               {IDENTIFIER}                    { yybegin(AFTER); return COONAME; }
<GETTER>             {IDENTIFIER}                    { yybegin(AFTER); return VARIABLE; }
<YYINITIAL,
 TYPE>               {IDENTIFIER}                    { yybegin(AFTER); return IDENTIFIER; }

                     {CRLF}                          { yybegin(YYINITIAL); return CRLF; }
<CLASS,
 NAME,
 TYPE>               {WHITE_SPACE}                   { return WHITE_SPACE; }
                     {WHITE_SPACE}                   { yybegin(YYINITIAL); return WHITE_SPACE; }
                     .                               { yybegin(IN_BAD); return com.intellij.psi.TokenType.BAD_CHARACTER; }
