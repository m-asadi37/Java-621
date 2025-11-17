public class Main {

    static int num;
    static String str;

    public static void main(String[] args){
        System.out.println("num is : " + num);
        System.out.println("str is : " + str);
        System.out.println("*****");

        //primitive
        //byte ... long float double char boolean
        //1. value only
        //2. not null - default value 0 0.0 \u0000

        int i0;
        i0 = 10;

        int i1 = 11, i2 = 12, i3;
        System.out.println(i1);
        i1 = -10;
        System.out.println(i1);

        double abcABC123$_;
        double d1 = 10, D1 = 10;

        var var1 = "sss";
        var var2 = 12;

        //decimal
        //byte - 1
        //short - 2
        //int (*) - 4
        //long (l,L) - 8

        long num1 = 10L;

        //floating
        //float(f,F) - 4
        //double(*) - 8
        double d2 = 10.1234;
        float f1 = 12.345f;

        //char
        char c1 = 'A';
        char c2 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);

        //boolean - 1 bit -> 1/0 true/false
        boolean b1 = true;
        boolean b2 = 12 > 14;


        //non-primitive
        //String
        //1. value + method + detail
        //2. nullable
        String strNull = null;

        String str1 = "asd";
        System.out.println(str1);
        String str2 = "java\nphp\tپایتون";
        str1 = "ali says : \"hello\"";
        System.out.println(str1);

        String str3 = """
                سلام
                چطوری؟
                علی گفت : "چه کلاس خوبی"
                """;
        System.out.println(str3);

    }
}
