import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str1 = "java php python php c++ js";

        System.out.println(str1.length());

        String str2 = str1.toUpperCase();
        System.out.println(str2);
        System.out.println(str1);

        char c1 = str1.charAt(5);
        System.out.println(c1);

        System.out.println(str1.indexOf('+'));
        System.out.println(str1.indexOf("py"));
        System.out.println(str1.indexOf('h', 10));
        System.out.println(str1.lastIndexOf('+'));

        String s1 = str1.substring(5);
        System.out.println(s1);
        System.out.println(str1);
        System.out.println(str1.substring(5,12));

        String a1 = "aaa";
        String a2 = "aaa";
        String a3 = new String("aaa");
        System.out.println(a3);
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a3));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equals(str2));

        String abc = "   a ab abc    ".trim();
        String abcTrim = abc.trim();
        System.out.println(abcTrim);

        System.out.println(str1.replace('j', 'J'));
        System.out.println(str1.replace("php", "Rust"));
        System.out.println(str1.replaceAll("php", "Go"));
        System.out.println(str1.replaceFirst("php", "html"));

        System.out.println(str1.contains("c#"));
        System.out.println(str1.contains("c++"));
        System.out.println(str1.startsWith("ja"));
        System.out.println(str1.endsWith(". "));

        System.out.println(" a".isBlank());
        System.out.println("  ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());

        System.out.println(Arrays.toString(str1.toCharArray()));

        System.out.println(Arrays.toString(str1.getBytes()));

        String[] split = str1.split(" ");
        System.out.println(Arrays.toString(split));

        split = str1.split("p");
        System.out.println(Arrays.toString(split));

        String join = String.join("-", "1","2","3","4");
        System.out.println(join);

        join = String.join("*", split);
        System.out.println(join);

        String format = String.format("age : %d - name : %s", 12, "ali");
        System.out.println(format);
    }
}
