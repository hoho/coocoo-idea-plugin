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

  private int afterJavaScript = YYINITIAL;
  private int afterSomething = IN_TEMPLATE;

  protected abstract void readJavaScript(int state) throws java.io.IOException;
%}


CRLF = (\r|\n|\r\n)+
WHITE_SPACE = [\ \t\f]+
TPL_NAME = [a-zA-Z][a-zA-Z0-9_-]*
IDENTIFIER = [a-zA-Z_][a-zA-Z0-9_]*
STRING = \"([^\"\r\n\\]|\\.)*\" | '([^'\r\n\\]|\\.)*'
LONG_STRING = \"\"\"([^\"\r\n\\]|\\.)*\"\"\" | '''([^'\r\n\\]|\\.)*'''
KEYWORD = "ACT"|"ATTR"|"CALL"|"CHOOSE"|"EACH"|"SET"|"TEST"|"WITH"|"WHEN"|"OTHERWISE"|"ELSE"|"PAYLOAD"|"MEM"|"TRIGGER"
COMMENT = [\ \t\f]* ("//" [^\r\n]* | "/*" [^*] ~"*/" | "/*" "*"+ "/") [\ \t\f]*

CSS_BEM_NAME = [a-zA-Z0-9-]+
CSS_NAME = [a-zA-Z_0-9-]+
CSS_CLASS = "." {CSS_NAME}
CSS_ATTR = "[" {WHITE_SPACE}* {CSS_NAME} {WHITE_SPACE}* ("=" {WHITE_SPACE}* ({CSS_NAME} | {STRING}) {WHITE_SPACE}*)? "]"
CSS_ID = "#" {CSS_NAME}
CSS_BLOCK = "%" {CSS_BEM_NAME}
CSS_ELEM = "(" {WHITE_SPACE}* {CSS_BEM_NAME} {WHITE_SPACE}* ")"
CSS_MOD = "{" {WHITE_SPACE}* {CSS_BEM_NAME} {WHITE_SPACE}* ("=" {WHITE_SPACE}* {CSS_BEM_NAME} {WHITE_SPACE}*)? "}"
CSS = [a-z][a-z_0-9-]* ({CSS_CLASS} | {CSS_ATTR} | {CSS_ID} | {CSS_BLOCK} | {CSS_ELEM} | {CSS_MOD})*

ATTR = @[a-zA-Z_-]+

JAVASCRIPT = . | {WHITE_SPACE} | {CRLF} | {COMMENT} | {STRING} | {ATTR} | {KEYWORD}


%state IN_JAVASCRIPT
%state IN_JAVASCRIPT2
%state IN_UJAVASCRIPT
%state IN_UJAVASCRIPT2
%state IN_TEMPLATE
%state IN_VAR_DECL
%state IN_CALL
%state IN_BAD
%state AFTER_SOMETHING

%%

<IN_BAD>             [^\r\n]+                        { return com.intellij.psi.TokenType.BAD_CHARACTER; }

<YYINITIAL>          {TPL_NAME}                      { yybegin(IN_VAR_DECL); return TEMPLATE_NAME; }
<YYINITIAL>          {WHITE_SPACE}                   { yybegin(IN_TEMPLATE); return WHITE_SPACE; }

<AFTER_SOMETHING>    {WHITE_SPACE}                   { yybegin(afterSomething); return WHITE_SPACE; }

<IN_TEMPLATE,
 IN_VAR_DECL>        {STRING} | {LONG_STRING}        { afterSomething = yystate(); yybegin(AFTER_SOMETHING); return STRING; }

<IN_JAVASCRIPT>      {JAVASCRIPT}                    { yybegin(IN_JAVASCRIPT2); readJavaScript(afterJavaScript); return JAVASCRIPT; }
<IN_JAVASCRIPT2>     {JAVASCRIPT}                    { return JAVASCRIPT; }

<IN_UJAVASCRIPT>     {JAVASCRIPT}                    { yybegin(IN_UJAVASCRIPT2); readJavaScript(afterJavaScript); return JAVASCRIPT; }
<IN_UJAVASCRIPT2>    {JAVASCRIPT}                    { return JAVASCRIPT; }

<IN_TEMPLATE,
 IN_VAR_DECL,
 IN_CALL>            "((("                           { afterJavaScript = yystate(); yybegin(IN_UJAVASCRIPT); return JAVASCRIPT_BEGIN; }

<IN_TEMPLATE,
 IN_VAR_DECL,
 IN_CALL>            "("                             { afterJavaScript = yystate(); yybegin(IN_JAVASCRIPT); return JAVASCRIPT_BEGIN; }

<IN_TEMPLATE,
 IN_VAR_DECL>        ")))"                           { return JAVASCRIPT_END; }
<IN_CALL>            ")))"                           { yybegin(IN_TEMPLATE); return JAVASCRIPT_END; }

<IN_TEMPLATE,
 IN_VAR_DECL>        ")"                             { return JAVASCRIPT_END; }
<IN_CALL>            ")"                             { yybegin(IN_TEMPLATE); return JAVASCRIPT_END; }

<IN_VAR_DECL>        {IDENTIFIER}                    { return VARIABLE; }

<IN_TEMPLATE>        "CALL"                          { afterSomething = IN_CALL; yybegin(AFTER_SOMETHING); return KEYWORD; }
<IN_CALL>            {TPL_NAME}                      { yybegin(IN_TEMPLATE); return TEMPLATE_NAME; }

<IN_TEMPLATE>        "EACH" | "SET" | "WITH"         { afterSomething = IN_VAR_DECL; yybegin(AFTER_SOMETHING); return KEYWORD; }

<IN_TEMPLATE>        {KEYWORD}                       { afterSomething = yystate(); yybegin(AFTER_SOMETHING); return KEYWORD; }

<IN_TEMPLATE>        {CSS}                           { afterSomething = yystate(); yybegin(AFTER_SOMETHING); return CSS; }
<IN_TEMPLATE>        {ATTR}                          { afterSomething = yystate(); yybegin(AFTER_SOMETHING); return CSS; }

                     {COMMENT}                       { return COMMENT; }

                     {CRLF}                          { yybegin(YYINITIAL); return CRLF; }
                     {WHITE_SPACE}                   { return WHITE_SPACE; }
                     .                               { yybegin(IN_BAD); return com.intellij.psi.TokenType.BAD_CHARACTER; }
