import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int d = scanner.nextInt();

        int[][] arr = new int[n][n];
        int count = 1;

        int up = 0, down = n - 1, left = 0, right = n - 1;

        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                arr[down][i] = count++;
            }
            down--;

            for (int i = down; i >= up; i--) {
                arr[i][right] = count++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                arr[up][i] = count++;
            }
            up++;

            for (int i = up; i <= down; i++) {
                arr[i][left] = count++;
            }
            left++;
        }


        int rowS = -1, rowD = -1, colS = -1, colD = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == s) {
                    rowS = i;
                    colS = j;
                } else if (arr[i][j] == d) {
                    rowD = i;
                    colD = j;
                }
            }
        }

        if (colD > colS)
            System.out.println(colD - colS + " R");
        else if (colD < colS)
            System.out.println(colD - colS + " L");

        if (rowS < rowD)
            System.out.println(rowD - rowS + " D");
        else if (rowS > rowD)
            System.out.println(rowS - rowD + " U");



    }
}
