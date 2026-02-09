// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class CondFactDeclDerived1 extends CondFactDecl {

    private CondFactDecl CondFactDecl;
    private Relop Relop;
    private ExprDecl ExprDecl;

    public CondFactDeclDerived1 (CondFactDecl CondFactDecl, Relop Relop, ExprDecl ExprDecl) {
        this.CondFactDecl=CondFactDecl;
        if(CondFactDecl!=null) CondFactDecl.setParent(this);
        this.Relop=Relop;
        if(Relop!=null) Relop.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
    }

    public CondFactDecl getCondFactDecl() {
        return CondFactDecl;
    }

    public void setCondFactDecl(CondFactDecl CondFactDecl) {
        this.CondFactDecl=CondFactDecl;
    }

    public Relop getRelop() {
        return Relop;
    }

    public void setRelop(Relop Relop) {
        this.Relop=Relop;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondFactDecl!=null) CondFactDecl.accept(visitor);
        if(Relop!=null) Relop.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFactDecl!=null) CondFactDecl.traverseTopDown(visitor);
        if(Relop!=null) Relop.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFactDecl!=null) CondFactDecl.traverseBottomUp(visitor);
        if(Relop!=null) Relop.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFactDeclDerived1(\n");

        if(CondFactDecl!=null)
            buffer.append(CondFactDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Relop!=null)
            buffer.append(Relop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFactDeclDerived1]");
        return buffer.toString();
    }
}
