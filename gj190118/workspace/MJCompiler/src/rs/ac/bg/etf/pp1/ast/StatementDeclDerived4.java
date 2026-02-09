// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived4 extends StatementDecl {

    private ContinueStmt ContinueStmt;

    public StatementDeclDerived4 (ContinueStmt ContinueStmt) {
        this.ContinueStmt=ContinueStmt;
        if(ContinueStmt!=null) ContinueStmt.setParent(this);
    }

    public ContinueStmt getContinueStmt() {
        return ContinueStmt;
    }

    public void setContinueStmt(ContinueStmt ContinueStmt) {
        this.ContinueStmt=ContinueStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ContinueStmt!=null) ContinueStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ContinueStmt!=null) ContinueStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ContinueStmt!=null) ContinueStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived4(\n");

        if(ContinueStmt!=null)
            buffer.append(ContinueStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived4]");
        return buffer.toString();
    }
}
