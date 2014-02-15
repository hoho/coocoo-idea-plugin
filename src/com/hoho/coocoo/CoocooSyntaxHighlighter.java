package com.hoho.coocoo;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.hoho.coocoo.psi.CoocooTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class CoocooSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("COOCOO_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TEMPLATE_NAME = createTextAttributesKey("COOCOO_TEMPLATE_NAME", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey TAG = createTextAttributesKey("COOCOO_TAG", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey VARIABLE_NAME = createTextAttributesKey("COOCOO_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey STRING = createTextAttributesKey("COOCOO_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey JAVASCRIPT = createTextAttributesKey("COOCOO_JAVASCRIPT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("COOCOO_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("COOCOO_BAD_CHARACTER", DefaultLanguageHighlighterColors.DOC_COMMENT);

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] TEMPLATE_NAMES = new TextAttributesKey[]{TEMPLATE_NAME};
    private static final TextAttributesKey[] TAGS = new TextAttributesKey[]{TAG};
    private static final TextAttributesKey[] VARIABLE_NAMES = new TextAttributesKey[]{VARIABLE_NAME};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] JAVASCRIPTS = new TextAttributesKey[]{JAVASCRIPT};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHARACTERS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CoocooLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CoocooTypes.TEMPLATE_NAME)) {
            return TEMPLATE_NAMES;
        } else if (tokenType.equals(CoocooTypes.KEYWORD)) {
            return KEYWORDS;
        } else if (tokenType.equals(CoocooTypes.VARIABLE)) {
            return VARIABLE_NAMES;
        } else if (tokenType.equals(CoocooTypes.JAVASCRIPT)) {
            return JAVASCRIPTS;
        } else if (tokenType.equals(CoocooTypes.COMMENT)) {
            return COMMENTS;
        } else if (tokenType.equals(CoocooTypes.STRING)) {
            return STRINGS;
        } else if (tokenType.equals(CoocooTypes.CSS)) {
            return TAGS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTERS;
        } else {
            return EMPTY;
        }
    }
}
