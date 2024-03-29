// generated with ast extension for cup
// version 0.8
// 22/5/2019 0:52:13


package rs.ac.bg.etf.pp1.ast;

public class TermSingle extends Term {

    private Powfact Powfact;

    public TermSingle (Powfact Powfact) {
        this.Powfact=Powfact;
        if(Powfact!=null) Powfact.setParent(this);
    }

    public Powfact getPowfact() {
        return Powfact;
    }

    public void setPowfact(Powfact Powfact) {
        this.Powfact=Powfact;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Powfact!=null) Powfact.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Powfact!=null) Powfact.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Powfact!=null) Powfact.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TermSingle(\n");

        if(Powfact!=null)
            buffer.append(Powfact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TermSingle]");
        return buffer.toString();
    }
}
