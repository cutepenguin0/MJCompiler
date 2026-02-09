// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived1 extends StatementDecl {

    private IfStmt IfStmt;

    public StatementDeclDerived1 (IfStmt IfStmt) {
        this.IfStmt=IfStmt;
        if(IfStmt!=null) IfStmt.setParent(this);
    }

    public IfStmt getIfStmt() {
        return IfStmt;
    }

    public void setIfStmt(IfStmt IfStmt) {
        this.IfStmt=IfStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IfStmt!=null) IfStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IfStmt!=null) IfStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IfStmt!=null) IfStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived1(\n");

        if(IfStmt!=null)
            buffer.append(IfStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived1]");
        return buffer.toString();
    }
}
