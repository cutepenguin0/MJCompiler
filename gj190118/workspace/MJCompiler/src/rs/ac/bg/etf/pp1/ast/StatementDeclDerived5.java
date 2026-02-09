// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived5 extends StatementDecl {

    private ReturnVoidStmt ReturnVoidStmt;

    public StatementDeclDerived5 (ReturnVoidStmt ReturnVoidStmt) {
        this.ReturnVoidStmt=ReturnVoidStmt;
        if(ReturnVoidStmt!=null) ReturnVoidStmt.setParent(this);
    }

    public ReturnVoidStmt getReturnVoidStmt() {
        return ReturnVoidStmt;
    }

    public void setReturnVoidStmt(ReturnVoidStmt ReturnVoidStmt) {
        this.ReturnVoidStmt=ReturnVoidStmt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ReturnVoidStmt!=null) ReturnVoidStmt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ReturnVoidStmt!=null) ReturnVoidStmt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ReturnVoidStmt!=null) ReturnVoidStmt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived5(\n");

        if(ReturnVoidStmt!=null)
            buffer.append(ReturnVoidStmt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived5]");
        return buffer.toString();
    }
}
