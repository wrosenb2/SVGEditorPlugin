// This is a generated file. Not intended for manual editing.
package com.aroon.intellij.svgeditor.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.aroon.intellij.svgeditor.psi.SVGTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.aroon.intellij.svgeditor.psi.*;

public class SVGPropertyImpl extends ASTWrapperPsiElement implements SVGProperty {

  public SVGPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SVGVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SVGVisitor) accept((SVGVisitor)visitor);
    else super.accept(visitor);
  }

}
