// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived3 extends StatementDecl {

    private BreakStmt BreakStmt;

    public StatementDeclDerived3 (BreakStmt BreakStmt) {
        this.BreakStmt=BreakStmt;
        if(BreakStmt!=null) BreakStmt.setParent(this);
    }

    public BreakStmt getBreakStmt() {
        return BreakStmt;
    }

    public void setBreakStmt(BreakStmt BreakStmt) {
        this.BreakStmt=BreakStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BreakStmt!=null) BreakStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BreakStmt!=null) BreakStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BreakStmt!=null) BreakStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived3(\n");

        if(BreakStmt!=null)
            buffer.append(BreakStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived3]");
        return buffer.toString();
    }
}
