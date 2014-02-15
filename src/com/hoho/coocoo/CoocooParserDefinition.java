package com.hoho.coocoo;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.hoho.coocoo.parser.CoocooParser;
import com.hoho.coocoo.psi.CoocooFile;
import com.hoho.coocoo.psi.CoocooTypes;
import org.jetbrains.annotations.NotNull;


public class CoocooParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(CoocooTypes.COMMENT, CoocooTypes.JAVASCRIPT);

    public static final IFileElementType FILE = new IFileElementType(Language.<CoocooLanguage>findInstance(CoocooLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CoocooIndentingLexer();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new CoocooParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new CoocooFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MUST;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return CoocooTypes.Factory.createElement(node);
    }
}
