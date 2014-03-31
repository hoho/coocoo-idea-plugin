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
            new AttributesDescriptor("String", CoocooSyntaxHighlighter.STRING),
            new AttributesDescriptor("JavaScript", CoocooSyntaxHighlighter.JAVASCRIPT),
            new AttributesDescriptor("Comment", CoocooSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Pusher", CoocooSyntaxHighlighter.PUSHER),
            new AttributesDescriptor("Subcoocoo", CoocooSyntaxHighlighter.SUBCOOCOO),
            new AttributesDescriptor("Variable", CoocooSyntaxHighlighter.VARIABLE),
            new AttributesDescriptor("Property", CoocooSyntaxHighlighter.PROPERTY),
            new AttributesDescriptor("Accessor", CoocooSyntaxHighlighter.ACCESSOR),
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
                "view Item\n" +
                "    @model<model Item>\n" +
                "    @textNode<?dom>\n" +
                "\n" +
                "    construct $m\n" +
                "        set @model $m\n" +
                "\n" +
                "        model Item $m\n" +
                "            on change \"title\" $val\n" +
                "                dom @textNode text set $val\n" +
                "\n" +
                "            on destroy\n" +
                "                destroy\n" +
                "\n" +
                "       =set $tmp" +
                "           +call someMethod (1) (2)" +
                "\n" +
                "    ^render\n" +
                "        *template \"conkitty:item\" apply [+model Item @model get @title]\n" +
                "            \"text\" $node\n" +
                "                set @textNode $node\n" +
                "\n" +
                "            \"remove\" $node\n" +
                "                dom $node\n" +
                "                    on \"click\"\n" +
                "                        js\n" +
                "                            alert(123);\n" +
                "                        model Item @model destroy\n" +
                "\n" +
                "    =someMethod $arg1 $arg2\n" +
                "        +(arg1 + arg2)";
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
