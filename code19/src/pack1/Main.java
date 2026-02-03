package pack1;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();

        test.publ = 10;
        test.prot = 20;
        test.def = 30;
//      test.prop4 = 40;

        test.print();
    }
}
