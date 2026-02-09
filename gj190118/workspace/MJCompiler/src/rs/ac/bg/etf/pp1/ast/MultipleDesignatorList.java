// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class MultipleDesignatorList extends DesignatorListNotEmpty {

    private DesignatorListNotEmpty DesignatorListNotEmpty;
    private Designator Designator;

    public MultipleDesignatorList (DesignatorListNotEmpty DesignatorListNotEmpty, Designator Designator) {
        this.DesignatorListNotEmpty=DesignatorListNotEmpty;
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.setParent(this);
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
    }

    public DesignatorListNotEmpty getDesignatorListNotEmpty() {
        return DesignatorListNotEmpty;
    }

    public void setDesignatorListNotEmpty(DesignatorListNotEmpty DesignatorListNotEmpty) {
        this.DesignatorListNotEmpty=DesignatorListNotEmpty;
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.accept(visitor);
        if(Designator!=null) Designator.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.traverseTopDown(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorListNotEmpty!=null) DesignatorListNotEmpty.traverseBottomUp(visitor);
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultipleDesignatorList(\n");

        if(DesignatorListNotEmpty!=null)
            buffer.append(DesignatorListNotEmpty.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultipleDesignatorList]");
        return buffer.toString();
    }
}
