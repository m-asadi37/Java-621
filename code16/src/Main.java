public class Main {

    public static void main(String[] args) {
        //primitive : call by value
        int i1 = 10;
        System.out.println("i1 before call: " + i1);
        changeNumber(i1);
        System.out.println("i1 after call: " + i1);

        System.out.println("*******");

        //non primitive (String) : call by value
        String str1 = "java";
        System.out.println("str before call: " + str1);
        changeString(str1);
        System.out.println("str after call: " + str1);

        System.out.println("*******");

        //object parameter  : call by reference
        Cup cup = new Cup(0, "late");
        System.out.println("cup before call: " + cup.print());
        fillCup(cup);
        System.out.println("cup after call: " + cup.print());
    }

    private static void fillCup(Cup cup) {
        cup.gr = 10;
        cup.coffee = cup.coffee.toUpperCase();
        System.out.println("parameter in method: " + cup.print());
    }

    private static void changeString(String str1) {
        str1 = str1.concat("!!!!");
        System.out.println("parameter in method: " + str1);
    }

    private static void changeNumber(int n) {
        n *= 2;
        System.out.println("parameter in method: " + n);
    }
}
