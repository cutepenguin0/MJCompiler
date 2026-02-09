// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class IfStmt implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ConditionList ConditionList;
    private StatementDecl StatementDecl;

    public IfStmt (ConditionList ConditionList, StatementDecl StatementDecl) {
        this.ConditionList=ConditionList;
        if(ConditionList!=null) ConditionList.setParent(this);
        this.StatementDecl=StatementDecl;
        if(StatementDecl!=null) StatementDecl.setParent(this);
    }

    public ConditionList getConditionList() {
        return ConditionList;
    }

    public void setConditionList(ConditionList ConditionList) {
        this.ConditionList=ConditionList;
    }

    public StatementDecl getStatementDecl() {
        return StatementDecl;
    }

    public void setStatementDecl(StatementDecl StatementDecl) {
        this.StatementDecl=StatementDecl;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConditionList!=null) ConditionList.accept(visitor);
        if(StatementDecl!=null) StatementDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConditionList!=null) ConditionList.traverseTopDown(visitor);
        if(StatementDecl!=null) StatementDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConditionList!=null) ConditionList.traverseBottomUp(visitor);
        if(StatementDecl!=null) StatementDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("IfStmt(\n");

        if(ConditionList!=null)
            buffer.append(ConditionList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementDecl!=null)
            buffer.append(StatementDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [IfStmt]");
        return buffer.toString();
    }
}
