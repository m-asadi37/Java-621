package pack2;

import pack1.Test;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();

        test.publ = 10;
//      test.prot = 20;
//      test.prv = 30;
//      test.def = 40;

        test.print();
    }
}
