package com.hoho.coocoo.psi;

import com.intellij.psi.tree.IElementType;
import com.hoho.coocoo.CoocooLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CoocooElementType extends IElementType {
    public CoocooElementType(@NotNull @NonNls String debugName) {
        super(debugName, CoocooLanguage.INSTANCE);
    }
}
