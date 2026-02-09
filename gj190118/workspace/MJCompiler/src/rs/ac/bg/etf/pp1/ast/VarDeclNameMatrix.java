// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class VarDeclNameMatrix extends VarDecl {

    private String varName;
    private Brackets Brackets;
    private Brackets Brackets1;

    public VarDeclNameMatrix (String varName, Brackets Brackets, Brackets Brackets1) {
        this.varName=varName;
        this.Brackets=Brackets;
        if(Brackets!=null) Brackets.setParent(this);
        this.Brackets1=Brackets1;
        if(Brackets1!=null) Brackets1.setParent(this);
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName=varName;
    }

    public Brackets getBrackets() {
        return Brackets;
    }

    public void setBrackets(Brackets Brackets) {
        this.Brackets=Brackets;
    }

    public Brackets getBrackets1() {
        return Brackets1;
    }

    public void setBrackets1(Brackets Brackets1) {
        this.Brackets1=Brackets1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Brackets!=null) Brackets.accept(visitor);
        if(Brackets1!=null) Brackets1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Brackets!=null) Brackets.traverseTopDown(visitor);
        if(Brackets1!=null) Brackets1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Brackets!=null) Brackets.traverseBottomUp(visitor);
        if(Brackets1!=null) Brackets1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclNameMatrix(\n");

        buffer.append(" "+tab+varName);
        buffer.append("\n");

        if(Brackets!=null)
            buffer.append(Brackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Brackets1!=null)
            buffer.append(Brackets1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclNameMatrix]");
        return buffer.toString();
    }
}
