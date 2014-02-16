package com.hoho.coocoo;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.hoho.coocoo.psi.CoocooTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class CoocooSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("COOCOO_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("COOCOO_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING = createTextAttributesKey("COOCOO_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey JAVASCRIPT = createTextAttributesKey("COOCOO_JAVASCRIPT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("COOCOO_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey PUSHER = createTextAttributesKey("COOCOO_PUSHER", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey SUBCOOCOO = createTextAttributesKey("COOCOO_SUBCOOCOO", DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey VARIABLE_GETTER = createTextAttributesKey("COOCOO_VARIABLE_GETTER", DefaultLanguageHighlighterColors.MARKUP_ATTRIBUTE);
    public static final TextAttributesKey PROPERTY_GETTER = createTextAttributesKey("COOCOO_PROPERTY_GETTER", DefaultLanguageHighlighterColors.MARKUP_ATTRIBUTE);
    public static final TextAttributesKey TYPIFICATION = createTextAttributesKey("COOCOO_TYPIFICATION", DefaultLanguageHighlighterColors.METADATA);

    private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] IDENTIFIERS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] STRINGS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] JAVASCRIPTS = new TextAttributesKey[]{JAVASCRIPT};
    private static final TextAttributesKey[] PUSHERS = new TextAttributesKey[]{PUSHER};
    private static final TextAttributesKey[] COMMENTS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] SUBCOOCOOS = new TextAttributesKey[]{SUBCOOCOO};
    private static final TextAttributesKey[] VARIABLE_GETTERS = new TextAttributesKey[]{VARIABLE_GETTER};
    private static final TextAttributesKey[] PROPERTY_GETTERS = new TextAttributesKey[]{PROPERTY_GETTER};
    private static final TextAttributesKey[] TYPIFICATIONS = new TextAttributesKey[]{TYPIFICATION};
    private static final TextAttributesKey[] EMPTY = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CoocooLexer();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CoocooTypes.KEYWORD)) {
            return KEYWORDS;
        } else if (tokenType.equals(CoocooTypes.IDENTIFIER)) {
            return IDENTIFIERS;
        } else if (tokenType.equals(CoocooTypes.JAVASCRIPT)) {
            return JAVASCRIPTS;
        } else if (tokenType.equals(CoocooTypes.COMMENT)) {
            return COMMENTS;
        } else if (tokenType.equals(CoocooTypes.PUSHER)) {
            return PUSHERS;
        } else if (tokenType.equals(CoocooTypes.SUBCOOCOO)) {
            return SUBCOOCOOS;
        } else if (tokenType.equals(CoocooTypes.STRING)) {
            return STRINGS;
        } else if (tokenType.equals(CoocooTypes.VARIABLE_GETTER)) {
            return VARIABLE_GETTERS;
        } else if (tokenType.equals(CoocooTypes.PROPERTY_GETTER)) {
            return PROPERTY_GETTERS;
        } else if (tokenType.equals(CoocooTypes.TYPIFICATION)) {
            return TYPIFICATIONS;
        } else {
            return EMPTY;
        }
    }
}
