package com.aroon.intellij.svgeditor;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by williamrosenbloom on 4/14/16.
 */
public class SVGLexerAdapter extends FlexAdapter {
    public SVGLexerAdapter() {
        super(new SVGLexer((Reader) null));
    }
}
