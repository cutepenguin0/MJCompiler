// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived9 extends StatementDecl {

    private PrintStmtWithoutNumber PrintStmtWithoutNumber;

    public StatementDeclDerived9 (PrintStmtWithoutNumber PrintStmtWithoutNumber) {
        this.PrintStmtWithoutNumber=PrintStmtWithoutNumber;
        if(PrintStmtWithoutNumber!=null) PrintStmtWithoutNumber.setParent(this);
    }

    public PrintStmtWithoutNumber getPrintStmtWithoutNumber() {
        return PrintStmtWithoutNumber;
    }

    public void setPrintStmtWithoutNumber(PrintStmtWithoutNumber PrintStmtWithoutNumber) {
        this.PrintStmtWithoutNumber=PrintStmtWithoutNumber;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(PrintStmtWithoutNumber!=null) PrintStmtWithoutNumber.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(PrintStmtWithoutNumber!=null) PrintStmtWithoutNumber.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(PrintStmtWithoutNumber!=null) PrintStmtWithoutNumber.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived9(\n");

        if(PrintStmtWithoutNumber!=null)
            buffer.append(PrintStmtWithoutNumber.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived9]");
        return buffer.toString();
    }
}
