import java.util.*;

public class java2738 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] arr3 = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(arr3[i][j]);
            }
        }
    }
}
