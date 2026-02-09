// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementDeclDerived1 extends DesignatorStatementDecl {

    private DesignatorListForStmt DesignatorListForStmt;
    private Designator Designator;
    private Designator Designator1;

    public DesignatorStatementDeclDerived1 (DesignatorListForStmt DesignatorListForStmt, Designator Designator, Designator Designator1) {
        this.DesignatorListForStmt=DesignatorListForStmt;
        if(DesignatorListForStmt!=null) DesignatorListForStmt.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.Designator1=Designator1;
        if(Designator1!=null) Designator1.setParent(this);
    }

    public DesignatorListForStmt getDesignatorListForStmt() {
        return DesignatorListForStmt;
    }

    public void setDesignatorListForStmt(DesignatorListForStmt DesignatorListForStmt) {
        this.DesignatorListForStmt=DesignatorListForStmt;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public Designator getDesignator1() {
        return Designator1;
    }

    public void setDesignator1(Designator Designator1) {
        this.Designator1=Designator1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorListForStmt!=null) DesignatorListForStmt.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
        if(Designator1!=null) Designator1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorListForStmt!=null) DesignatorListForStmt.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(Designator1!=null) Designator1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorListForStmt!=null) DesignatorListForStmt.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(Designator1!=null) Designator1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementDeclDerived1(\n");

        if(DesignatorListForStmt!=null)
            buffer.append(DesignatorListForStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator1!=null)
            buffer.append(Designator1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementDeclDerived1]");
        return buffer.toString();
    }
}
