/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.compilation.UserEnum;

public final class ASTUserEnum extends AbstractApexNode<UserEnum> {

    ASTUserEnum(UserEnum userEnum) {
        super(userEnum);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    @Override
    public String getImage() {
        String apexName = getDefiningType();
        return apexName.substring(apexName.lastIndexOf('.') + 1);
    }

    public ASTModifierNode getModifiers() {
        return getFirstChildOfType(ASTModifierNode.class);
    }
}
