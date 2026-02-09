// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class DesignatorListForStmtMore extends DesignatorListForStmt {

    private DesignatorListNotEmpty DesignatorListNotEmpty;

    public DesignatorListForStmtMore (DesignatorListNotEmpty DesignatorListNotEmpty) {
        this.DesignatorListNotEmpty=DesignatorListNotEmpty;
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.setParent(this);
    }

    public DesignatorListNotEmpty getDesignatorListNotEmpty() {
        return DesignatorListNotEmpty;
    }

    public void setDesignatorListNotEmpty(DesignatorListNotEmpty DesignatorListNotEmpty) {
        this.DesignatorListNotEmpty=DesignatorListNotEmpty;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorListForStmtMore(\n");

        if(DesignatorListNotEmpty!=null)
            buffer.append(DesignatorListNotEmpty.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorListForStmtMore]");
        return buffer.toString();
    }
}
