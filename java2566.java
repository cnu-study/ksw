import java.util.*;

public class java2566 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int cnti = 0;
        int cntj = 0;
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cnt < arr[i][j]) {
                    cnt = arr[i][j];
                    cnti = i;
                    cntj = j;
                }
            }
        }

        System.out.println(cnt);
        System.out.printf("%d %d", cnti + 1, cntj + 1);
    }
}
