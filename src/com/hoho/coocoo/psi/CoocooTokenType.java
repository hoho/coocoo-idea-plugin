package com.hoho.coocoo.psi;

import com.intellij.psi.tree.IElementType;
import com.hoho.coocoo.CoocooLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CoocooTokenType extends IElementType {
    public CoocooTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CoocooLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CoocooTokenType." + super.toString();
    }
}
