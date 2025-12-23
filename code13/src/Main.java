import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //primitive : not null - default value - no method or detail / only value
        int i1 = 10;
        double d1 = 10.0;
        boolean b1 = true;
        char c1 = 'a';

        Integer i2 = 12;
        Double d2 = 3.14;
        Boolean b2 = true;
        Character c2 = 'a';

        int max = Integer.parseInt("1111");
        System.out.println(max + 1);

        Long l1 = 10L;
        //unboxing
        long l2 = l1;

        long l3 = 10L;
        //boxing
        Long l4 = l3;

        double pi = 3.1415;
        //cast
        int int1 = (int) pi;

        int[] ints = new int[5];
//        ints[0] = "havij";

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
    }
}
