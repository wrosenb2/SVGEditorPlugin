package com.aroon.intellij.svgeditor;

import com.intellij.lang.Language;

/**
 * Created by williamrosenbloom on 4/14/16.
 */
public class SVGLanguage extends Language {
    public static final SVGLanguage INSTANCE = new SVGLanguage();

    private SVGLanguage() {
        super("SVG-XML");
    }
}
