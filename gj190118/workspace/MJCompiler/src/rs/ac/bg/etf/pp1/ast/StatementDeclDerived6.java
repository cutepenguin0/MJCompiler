// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived6 extends StatementDecl {

    private ReturnExprStmt ReturnExprStmt;

    public StatementDeclDerived6 (ReturnExprStmt ReturnExprStmt) {
        this.ReturnExprStmt=ReturnExprStmt;
        if(ReturnExprStmt!=null) ReturnExprStmt.setParent(this);
    }

    public ReturnExprStmt getReturnExprStmt() {
        return ReturnExprStmt;
    }

    public void setReturnExprStmt(ReturnExprStmt ReturnExprStmt) {
        this.ReturnExprStmt=ReturnExprStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ReturnExprStmt!=null) ReturnExprStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnExprStmt!=null) ReturnExprStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnExprStmt!=null) ReturnExprStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived6(\n");

        if(ReturnExprStmt!=null)
            buffer.append(ReturnExprStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived6]");
        return buffer.toString();
    }
}
