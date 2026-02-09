// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class ForStmtDerived1 extends ForStmt {

    private DesignatorStmtList DesignatorStmtList;
    private CondFactList CondFactList;
    private DesignatorStmtList DesignatorStmtList1;
    private StatementDecl StatementDecl;

    public ForStmtDerived1 (DesignatorStmtList DesignatorStmtList, CondFactList CondFactList, DesignatorStmtList DesignatorStmtList1, StatementDecl StatementDecl) {
        this.DesignatorStmtList=DesignatorStmtList;
        if(DesignatorStmtList!=null) DesignatorStmtList.setParent(this);
        this.CondFactList=CondFactList;
        if(CondFactList!=null) CondFactList.setParent(this);
        this.DesignatorStmtList1=DesignatorStmtList1;
        if(DesignatorStmtList1!=null) DesignatorStmtList1.setParent(this);
        this.StatementDecl=StatementDecl;
        if(StatementDecl!=null) StatementDecl.setParent(this);
    }

    public DesignatorStmtList getDesignatorStmtList() {
        return DesignatorStmtList;
    }

    public void setDesignatorStmtList(DesignatorStmtList DesignatorStmtList) {
        this.DesignatorStmtList=DesignatorStmtList;
    }

    public CondFactList getCondFactList() {
        return CondFactList;
    }

    public void setCondFactList(CondFactList CondFactList) {
        this.CondFactList=CondFactList;
    }

    public DesignatorStmtList getDesignatorStmtList1() {
        return DesignatorStmtList1;
    }

    public void setDesignatorStmtList1(DesignatorStmtList DesignatorStmtList1) {
        this.DesignatorStmtList1=DesignatorStmtList1;
    }

    public StatementDecl getStatementDecl() {
        return StatementDecl;
    }

    public void setStatementDecl(StatementDecl StatementDecl) {
        this.StatementDecl=StatementDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStmtList!=null) DesignatorStmtList.accept(visitor);
        if(CondFactList!=null) CondFactList.accept(visitor);
        if(DesignatorStmtList1!=null) DesignatorStmtList1.accept(visitor);
        if(StatementDecl!=null) StatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStmtList!=null) DesignatorStmtList.traverseTopDown(visitor);
        if(CondFactList!=null) CondFactList.traverseTopDown(visitor);
        if(DesignatorStmtList1!=null) DesignatorStmtList1.traverseTopDown(visitor);
        if(StatementDecl!=null) StatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStmtList!=null) DesignatorStmtList.traverseBottomUp(visitor);
        if(CondFactList!=null) CondFactList.traverseBottomUp(visitor);
        if(DesignatorStmtList1!=null) DesignatorStmtList1.traverseBottomUp(visitor);
        if(StatementDecl!=null) StatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ForStmtDerived1(\n");

        if(DesignatorStmtList!=null)
            buffer.append(DesignatorStmtList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondFactList!=null)
            buffer.append(CondFactList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStmtList1!=null)
            buffer.append(DesignatorStmtList1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDecl!=null)
            buffer.append(StatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ForStmtDerived1]");
        return buffer.toString();
    }
}
