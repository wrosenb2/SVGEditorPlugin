// This is a generated file. Not intended for manual editing.
package com.aroon.intellij.svgeditor.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.aroon.intellij.svgeditor.psi.impl.*;

public interface SVGTypes {

  IElementType PROPERTY = new SVGElementType("PROPERTY");

  IElementType COMMENT = new SVGTokenType("COMMENT");
  IElementType CRLF = new SVGTokenType("CRLF");
  IElementType KEY = new SVGTokenType("KEY");
  IElementType SEPARATOR = new SVGTokenType("SEPARATOR");
  IElementType VALUE = new SVGTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new SVGPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
