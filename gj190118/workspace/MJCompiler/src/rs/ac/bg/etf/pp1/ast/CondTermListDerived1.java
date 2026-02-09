// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class CondTermListDerived1 extends CondTermList {

    private CondTermList CondTermList;
    private CondFactDecl CondFactDecl;

    public CondTermListDerived1 (CondTermList CondTermList, CondFactDecl CondFactDecl) {
        this.CondTermList=CondTermList;
        if(CondTermList!=null) CondTermList.setParent(this);
        this.CondFactDecl=CondFactDecl;
        if(CondFactDecl!=null) CondFactDecl.setParent(this);
    }

    public CondTermList getCondTermList() {
        return CondTermList;
    }

    public void setCondTermList(CondTermList CondTermList) {
        this.CondTermList=CondTermList;
    }

    public CondFactDecl getCondFactDecl() {
        return CondFactDecl;
    }

    public void setCondFactDecl(CondFactDecl CondFactDecl) {
        this.CondFactDecl=CondFactDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondTermList!=null) CondTermList.accept(visitor);
        if(CondFactDecl!=null) CondFactDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondTermList!=null) CondTermList.traverseTopDown(visitor);
        if(CondFactDecl!=null) CondFactDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondTermList!=null) CondTermList.traverseBottomUp(visitor);
        if(CondFactDecl!=null) CondFactDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondTermListDerived1(\n");

        if(CondTermList!=null)
            buffer.append(CondTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondFactDecl!=null)
            buffer.append(CondFactDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondTermListDerived1]");
        return buffer.toString();
    }
}
