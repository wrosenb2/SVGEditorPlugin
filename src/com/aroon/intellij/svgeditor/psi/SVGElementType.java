package com.aroon.intellij.svgeditor.psi;

import com.aroon.intellij.svgeditor.SVGLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by williamrosenbloom on 4/14/16.
 */
public class SVGElementType extends IElementType {
    public SVGElementType(@NotNull @NonNls String debugName) {
        super(debugName, SVGLanguage.INSTANCE);
    }
}
