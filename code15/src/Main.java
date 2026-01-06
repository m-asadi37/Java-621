public class Main {

    public static void main1(String[] args) {
        String str = "1404/01/17";
        String str2 = "1404/01/15";

        System.out.println(str.compareTo(str2));
        System.out.println("salam".compareTo("hello"));

        String email = "aaa@gmail.com";

        System.out.println("ASf90".matches("[a-zA-Z0-9]{5}"));
        System.out.println(email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"));

        String s1 = "";
        for (int i = 0; i < 5; i++) {
            s1 = s1 + "*";
        }
        System.out.println(s1);

        s1 = "*".repeat(7);
        System.out.println(s1);

        for (int i = 1; i <= 5; i++) {
            System.out.println("*".repeat(i));
        }

        String a1 = """
                salam
                  ahval shoma?
                  khoda hafez!
                """;
        System.out.println(a1.indent(2));
    }

    public static void main2(String[] args) {
        //String is immutable

        String s = "abc";

        //1. operator join +
        String a1 = s + "def";
        System.out.println(a1);
        System.out.println(s);

        //2. concat
        String a2 = s.concat("def");
        System.out.println(a2);
        System.out.println(s);

        //mutable Strings
        //3 StringBuffer
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append("def").append(1).append(2).append(3);
        System.out.println(sb1);

        //4 StringBuilder
        StringBuilder sb2 = new StringBuilder("abc");
        sb2.append("def").append(1).append(2).append(3);
        System.out.println(sb2);
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1 + "*";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        s1 = "";
        for (int i = 0; i < 100000; i++) {
            s1 = s1.concat("*");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb1.append('*');
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb2.append('*');
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


        System.out.println("ali" + " " + "ahmadi");
    }

}
