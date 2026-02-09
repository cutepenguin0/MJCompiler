// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class AddopExpr extends ExprDecl {

    private ExprDecl ExprDecl;
    private Addop Addop;
    private TermDecl TermDecl;

    public AddopExpr (ExprDecl ExprDecl, Addop Addop, TermDecl TermDecl) {
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
        this.Addop=Addop;
        if(Addop!=null) Addop.setParent(this);
        this.TermDecl=TermDecl;
        if(TermDecl!=null) TermDecl.setParent(this);
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public Addop getAddop() {
        return Addop;
    }

    public void setAddop(Addop Addop) {
        this.Addop=Addop;
    }

    public TermDecl getTermDecl() {
        return TermDecl;
    }

    public void setTermDecl(TermDecl TermDecl) {
        this.TermDecl=TermDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprDecl!=null) ExprDecl.accept(visitor);
        if(Addop!=null) Addop.accept(visitor);
        if(TermDecl!=null) TermDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
        if(Addop!=null) Addop.traverseTopDown(visitor);
        if(TermDecl!=null) TermDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        if(Addop!=null) Addop.traverseBottomUp(visitor);
        if(TermDecl!=null) TermDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AddopExpr(\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Addop!=null)
            buffer.append(Addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(TermDecl!=null)
            buffer.append(TermDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AddopExpr]");
        return buffer.toString();
    }
}
