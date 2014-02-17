package com.hoho.coocoo;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class CoocooColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", CoocooSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Identifier", CoocooSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("Class", CoocooSyntaxHighlighter.COOCLASS),
            new AttributesDescriptor("Name", CoocooSyntaxHighlighter.COONAME),
            new AttributesDescriptor("String", CoocooSyntaxHighlighter.STRING),
            new AttributesDescriptor("JavaScript", CoocooSyntaxHighlighter.JAVASCRIPT),
            new AttributesDescriptor("Comment", CoocooSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Pusher", CoocooSyntaxHighlighter.PUSHER),
            new AttributesDescriptor("Subcoocoo", CoocooSyntaxHighlighter.SUBCOOCOO),
            new AttributesDescriptor("Variable getter", CoocooSyntaxHighlighter.VARIABLE_GETTER),
            new AttributesDescriptor("Property getter", CoocooSyntaxHighlighter.PROPERTY_GETTER),
            new AttributesDescriptor("Variable", CoocooSyntaxHighlighter.VARIABLE),
            new AttributesDescriptor("Typification", CoocooSyntaxHighlighter.TYPIFICATION),
            new AttributesDescriptor("Nullable", CoocooSyntaxHighlighter.NULLABLE),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return CoocooIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CoocooSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "// Some comment\n" +
                "VIEW Item\n" +
                "    PROPERTY model<MODEL Item>\n" +
                "    PROPERTY textNode<?Node>\n" +
                "\n" +
                "    CONSTRUCT m\n" +
                "        THIS SET model $m\n" +
                "\n" +
                "        MODEL Item $m\n" +
                "            CHANGE \"title\" val\n" +
                "                DOM @textNode TEXT SET $val\n" +
                "\n" +
                "            DESTROY\n" +
                "                THIS DESTROY\n" +
                "\n" +
                "    RENDER\n" +
                "        +TEMPLATE \"conkitty:item\" APPLY [+MODEL Item @model GET title]\n" +
                "            \"text\" node\n" +
                "                THIS SET textNode $node\n" +
                "\n" +
                "            \"remove\" node\n" +
                "                DOM $node\n" +
                "                    CLICK\n" +
                "                        JS\n" +
                "                            alert(123);\n" +
                "                        MODEL Item @model DESTROY\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Coocoo";
    }
}
