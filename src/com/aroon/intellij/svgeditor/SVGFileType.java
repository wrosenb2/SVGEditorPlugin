package com.aroon.intellij.svgeditor;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by williamrosenbloom on 4/14/16.
 */
public class SVGFileType extends LanguageFileType {
    public static final SVGFileType INSTANCE = new SVGFileType();

    private SVGFileType() {
        super(SVGLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SVG Image";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "A vector image written as an SVG/XML document.";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "svg";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SVGIcons.FILE;
    }
}
