// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class NegativeTerm extends ExprDecl {

    private TermDecl TermDecl;

    public NegativeTerm (TermDecl TermDecl) {
        this.TermDecl=TermDecl;
        if(TermDecl!=null) TermDecl.setParent(this);
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
        if(TermDecl!=null) TermDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TermDecl!=null) TermDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TermDecl!=null) TermDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NegativeTerm(\n");

        if(TermDecl!=null)
            buffer.append(TermDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NegativeTerm]");
        return buffer.toString();
    }
}
