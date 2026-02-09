// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class VarDeclListingDerived1 extends VarDeclListing {

    private VarDeclListing VarDeclListing;
    private VarDeclList VarDeclList;

    public VarDeclListingDerived1 (VarDeclListing VarDeclListing, VarDeclList VarDeclList) {
        this.VarDeclListing=VarDeclListing;
        if(VarDeclListing!=null) VarDeclListing.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
    }

    public VarDeclListing getVarDeclListing() {
        return VarDeclListing;
    }

    public void setVarDeclListing(VarDeclListing VarDeclListing) {
        this.VarDeclListing=VarDeclListing;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclListing!=null) VarDeclListing.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclListing!=null) VarDeclListing.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclListing!=null) VarDeclListing.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclListingDerived1(\n");

        if(VarDeclListing!=null)
            buffer.append(VarDeclListing.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclListingDerived1]");
        return buffer.toString();
    }
}
