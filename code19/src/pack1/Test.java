package pack1;

public class Test {

    public int publ;
    protected int prot;
    /*default - package protected*/
    int def;
    private int prv;


    public void print() {
        System.out.println("pub: " + publ);
        System.out.println("prot: " + prot);
        System.out.println("def: " + def);
        System.out.println("private: " + prv);
    }
}
