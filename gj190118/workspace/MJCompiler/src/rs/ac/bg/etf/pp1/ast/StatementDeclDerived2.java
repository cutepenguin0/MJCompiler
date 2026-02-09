// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived2 extends StatementDecl {

    private IfElseStmt IfElseStmt;

    public StatementDeclDerived2 (IfElseStmt IfElseStmt) {
        this.IfElseStmt=IfElseStmt;
        if(IfElseStmt!=null) IfElseStmt.setParent(this);
    }

    public IfElseStmt getIfElseStmt() {
        return IfElseStmt;
    }

    public void setIfElseStmt(IfElseStmt IfElseStmt) {
        this.IfElseStmt=IfElseStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IfElseStmt!=null) IfElseStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IfElseStmt!=null) IfElseStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IfElseStmt!=null) IfElseStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived2(\n");

        if(IfElseStmt!=null)
            buffer.append(IfElseStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived2]");
        return buffer.toString();
    }
}
