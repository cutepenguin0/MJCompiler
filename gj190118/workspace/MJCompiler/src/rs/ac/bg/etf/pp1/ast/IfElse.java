// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class IfElse extends IfElseStmt {

    private IfStmt IfStmt;
    private StatementDecl StatementDecl;

    public IfElse (IfStmt IfStmt, StatementDecl StatementDecl) {
        this.IfStmt=IfStmt;
        if(IfStmt!=null) IfStmt.setParent(this);
        this.StatementDecl=StatementDecl;
        if(StatementDecl!=null) StatementDecl.setParent(this);
    }

    public IfStmt getIfStmt() {
        return IfStmt;
    }

    public void setIfStmt(IfStmt IfStmt) {
        this.IfStmt=IfStmt;
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
        if(IfStmt!=null) IfStmt.accept(visitor);
        if(StatementDecl!=null) StatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IfStmt!=null) IfStmt.traverseTopDown(visitor);
        if(StatementDecl!=null) StatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IfStmt!=null) IfStmt.traverseBottomUp(visitor);
        if(StatementDecl!=null) StatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("IfElse(\n");

        if(IfStmt!=null)
            buffer.append(IfStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDecl!=null)
            buffer.append(StatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [IfElse]");
        return buffer.toString();
    }
}
