package com.hoho.coocoo;

import com.intellij.lang.Language;


public class CoocooLanguage extends Language  {
    public static final CoocooLanguage INSTANCE = new CoocooLanguage();

    private CoocooLanguage() {
        super("Coocoo");
    }
}
