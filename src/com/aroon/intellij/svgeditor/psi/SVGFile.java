package com.aroon.intellij.svgeditor.psi;

import com.aroon.intellij.svgeditor.SVGFileType;
import com.aroon.intellij.svgeditor.SVGLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

/**
 * Created by williamrosenbloom on 4/14/16.
 */
public class SVGFile extends PsiFileBase {
    public SVGFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SVGLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SVGFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SVG File";
    }
}
