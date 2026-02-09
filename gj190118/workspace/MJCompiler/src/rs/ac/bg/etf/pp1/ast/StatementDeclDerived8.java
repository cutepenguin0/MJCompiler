// generated with ast extension for cup
// version 0.8
// 26/7/2024 22:11:22


package rs.ac.bg.etf.pp1.ast;

public class StatementDeclDerived8 extends StatementDecl {

    private PrintStmtWithNumber PrintStmtWithNumber;

    public StatementDeclDerived8 (PrintStmtWithNumber PrintStmtWithNumber) {
        this.PrintStmtWithNumber=PrintStmtWithNumber;
        if(PrintStmtWithNumber!=null) PrintStmtWithNumber.setParent(this);
    }

    public PrintStmtWithNumber getPrintStmtWithNumber() {
        return PrintStmtWithNumber;
    }

    public void setPrintStmtWithNumber(PrintStmtWithNumber PrintStmtWithNumber) {
        this.PrintStmtWithNumber=PrintStmtWithNumber;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(PrintStmtWithNumber!=null) PrintStmtWithNumber.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(PrintStmtWithNumber!=null) PrintStmtWithNumber.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(PrintStmtWithNumber!=null) PrintStmtWithNumber.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDeclDerived8(\n");

        if(PrintStmtWithNumber!=null)
            buffer.append(PrintStmtWithNumber.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDeclDerived8]");
        return buffer.toString();
    }
}
