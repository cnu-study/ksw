import java.util.*;
public class java2231 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = i;

            while (b > 0) {
                a += b % 10;
                b /= 10;
            }

            if (a == n) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("0");
    }
}
