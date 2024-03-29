// generated with ast extension for cup
// version 0.8
// 22/5/2019 0:52:13


package rs.ac.bg.etf.pp1.ast;

public class FactNewArrayInit extends Factor {

    private NewTypeArr NewTypeArr;
    private ArrayParts ArrayParts;

    public FactNewArrayInit (NewTypeArr NewTypeArr, ArrayParts ArrayParts) {
        this.NewTypeArr=NewTypeArr;
        if(NewTypeArr!=null) NewTypeArr.setParent(this);
        this.ArrayParts=ArrayParts;
        if(ArrayParts!=null) ArrayParts.setParent(this);
    }

    public NewTypeArr getNewTypeArr() {
        return NewTypeArr;
    }

    public void setNewTypeArr(NewTypeArr NewTypeArr) {
        this.NewTypeArr=NewTypeArr;
    }

    public ArrayParts getArrayParts() {
        return ArrayParts;
    }

    public void setArrayParts(ArrayParts ArrayParts) {
        this.ArrayParts=ArrayParts;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NewTypeArr!=null) NewTypeArr.accept(visitor);
        if(ArrayParts!=null) ArrayParts.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NewTypeArr!=null) NewTypeArr.traverseTopDown(visitor);
        if(ArrayParts!=null) ArrayParts.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NewTypeArr!=null) NewTypeArr.traverseBottomUp(visitor);
        if(ArrayParts!=null) ArrayParts.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactNewArrayInit(\n");

        if(NewTypeArr!=null)
            buffer.append(NewTypeArr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ArrayParts!=null)
            buffer.append(ArrayParts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactNewArrayInit]");
        return buffer.toString();
    }
}
