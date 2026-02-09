// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class MatrixCreation extends Factor {

    private Type Type;
    private ExprDecl ExprDecl;
    private ExprDecl ExprDecl1;

    public MatrixCreation (Type Type, ExprDecl ExprDecl, ExprDecl ExprDecl1) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ExprDecl=ExprDecl;
        if(ExprDecl!=null) ExprDecl.setParent(this);
        this.ExprDecl1=ExprDecl1;
        if(ExprDecl1!=null) ExprDecl1.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ExprDecl getExprDecl() {
        return ExprDecl;
    }

    public void setExprDecl(ExprDecl ExprDecl) {
        this.ExprDecl=ExprDecl;
    }

    public ExprDecl getExprDecl1() {
        return ExprDecl1;
    }

    public void setExprDecl1(ExprDecl ExprDecl1) {
        this.ExprDecl1=ExprDecl1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ExprDecl!=null) ExprDecl.accept(visitor);
        if(ExprDecl1!=null) ExprDecl1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ExprDecl!=null) ExprDecl.traverseTopDown(visitor);
        if(ExprDecl1!=null) ExprDecl1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ExprDecl!=null) ExprDecl.traverseBottomUp(visitor);
        if(ExprDecl1!=null) ExprDecl1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatrixCreation(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl!=null)
            buffer.append(ExprDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ExprDecl1!=null)
            buffer.append(ExprDecl1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatrixCreation]");
        return buffer.toString();
    }
}
