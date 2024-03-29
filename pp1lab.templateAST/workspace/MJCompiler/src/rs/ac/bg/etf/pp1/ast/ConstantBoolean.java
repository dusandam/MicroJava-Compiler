// generated with ast extension for cup
// version 0.8
// 22/5/2019 0:52:12


package rs.ac.bg.etf.pp1.ast;

public class ConstantBoolean extends ConstType {

    private String var;
    private Boolean boolvalue;

    public ConstantBoolean (String var, Boolean boolvalue) {
        this.var=var;
        this.boolvalue=boolvalue;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var=var;
    }

    public Boolean getBoolvalue() {
        return boolvalue;
    }

    public void setBoolvalue(Boolean boolvalue) {
        this.boolvalue=boolvalue;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstantBoolean(\n");

        buffer.append(" "+tab+var);
        buffer.append("\n");

        buffer.append(" "+tab+boolvalue);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstantBoolean]");
        return buffer.toString();
    }
}
