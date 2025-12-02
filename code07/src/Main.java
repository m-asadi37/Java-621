import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main1(String[] args) {

        String[] arr = {"java", "php", "c++", "python"};
        int[] arr2 = new int[5];
        arr2[0] = 12;
        System.out.println(arr2[0]);

        for (int i = 0; i < 5; i++) {
            arr2[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println(arr2.length);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Number Of Elements : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr3 = new String[size];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextLine();
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[][]{{1, 2, 3}, {2, 4, 5}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] arr3 = new int[3][3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    arr3[i][j][k] = i + j * 10 + k * 100;
                }
            }
        }

        int[] arr = {1, 6, 4, 8, 4, 9, 0, 11, 56, 3, -8};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

    }

}
