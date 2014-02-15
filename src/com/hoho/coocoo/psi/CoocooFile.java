package com.hoho.coocoo.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.hoho.coocoo.CoocooFileType;
import com.hoho.coocoo.CoocooLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class CoocooFile extends PsiFileBase {
    public CoocooFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, CoocooLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return CoocooFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Coocoo File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
