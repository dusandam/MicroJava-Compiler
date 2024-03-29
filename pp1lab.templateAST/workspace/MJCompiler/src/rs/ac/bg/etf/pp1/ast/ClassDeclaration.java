// generated with ast extension for cup
// version 0.8
// 22/5/2019 0:52:12


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclaration extends ClassDecl {

    private String cname;
    private Extension Extension;
    private Implementation Implementation;
    private VarDeclList VarDeclList;

    public ClassDeclaration (String cname, Extension Extension, Implementation Implementation, VarDeclList VarDeclList) {
        this.cname=cname;
        this.Extension=Extension;
        if(Extension!=null) Extension.setParent(this);
        this.Implementation=Implementation;
        if(Implementation!=null) Implementation.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname=cname;
    }

    public Extension getExtension() {
        return Extension;
    }

    public void setExtension(Extension Extension) {
        this.Extension=Extension;
    }

    public Implementation getImplementation() {
        return Implementation;
    }

    public void setImplementation(Implementation Implementation) {
        this.Implementation=Implementation;
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
        if(Extension!=null) Extension.accept(visitor);
        if(Implementation!=null) Implementation.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Extension!=null) Extension.traverseTopDown(visitor);
        if(Implementation!=null) Implementation.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Extension!=null) Extension.traverseBottomUp(visitor);
        if(Implementation!=null) Implementation.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclaration(\n");

        buffer.append(" "+tab+cname);
        buffer.append("\n");

        if(Extension!=null)
            buffer.append(Extension.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Implementation!=null)
            buffer.append(Implementation.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclaration]");
        return buffer.toString();
    }
}
