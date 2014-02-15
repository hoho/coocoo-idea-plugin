package com.hoho.coocoo;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CoocooFileType extends LanguageFileType {
    public static final com.hoho.coocoo.CoocooFileType INSTANCE = new com.hoho.coocoo.CoocooFileType();

    private CoocooFileType() {
        super(CoocooLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Coocoo file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Coocoo file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "coo";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CoocooIcons.FILE;
    }
}
