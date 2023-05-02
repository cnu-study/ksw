import java.util.Scanner;
public class java10430 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int c = in.nextInt();
        int cnt = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] == c) {
                cnt = cnt + 1;
            }
        }

        System.out.println(cnt);

    }
}

