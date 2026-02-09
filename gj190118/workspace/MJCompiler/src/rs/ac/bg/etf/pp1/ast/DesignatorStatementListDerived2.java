// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementListDerived2 extends DesignatorStatementList {

    private DesignatorStatementDecl DesignatorStatementDecl;

    public DesignatorStatementListDerived2 (DesignatorStatementDecl DesignatorStatementDecl) {
        this.DesignatorStatementDecl=DesignatorStatementDecl;
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.setParent(this);
    }

    public DesignatorStatementDecl getDesignatorStatementDecl() {
        return DesignatorStatementDecl;
    }

    public void setDesignatorStatementDecl(DesignatorStatementDecl DesignatorStatementDecl) {
        this.DesignatorStatementDecl=DesignatorStatementDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementListDerived2(\n");

        if(DesignatorStatementDecl!=null)
            buffer.append(DesignatorStatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementListDerived2]");
        return buffer.toString();
    }
}
