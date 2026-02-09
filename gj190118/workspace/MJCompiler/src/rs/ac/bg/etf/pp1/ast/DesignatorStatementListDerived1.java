// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementListDerived1 extends DesignatorStatementList {

    private DesignatorStatementList DesignatorStatementList;
    private DesignatorStatementDecl DesignatorStatementDecl;

    public DesignatorStatementListDerived1 (DesignatorStatementList DesignatorStatementList, DesignatorStatementDecl DesignatorStatementDecl) {
        this.DesignatorStatementList=DesignatorStatementList;
        if(DesignatorStatementList!=null) DesignatorStatementList.setParent(this);
        this.DesignatorStatementDecl=DesignatorStatementDecl;
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.setParent(this);
    }

    public DesignatorStatementList getDesignatorStatementList() {
        return DesignatorStatementList;
    }

    public void setDesignatorStatementList(DesignatorStatementList DesignatorStatementList) {
        this.DesignatorStatementList=DesignatorStatementList;
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
        if(DesignatorStatementList!=null) DesignatorStatementList.accept(visitor);
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementList!=null) DesignatorStatementList.traverseTopDown(visitor);
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementList!=null) DesignatorStatementList.traverseBottomUp(visitor);
        if(DesignatorStatementDecl!=null) DesignatorStatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementListDerived1(\n");

        if(DesignatorStatementList!=null)
            buffer.append(DesignatorStatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatementDecl!=null)
            buffer.append(DesignatorStatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementListDerived1]");
        return buffer.toString();
    }
}
