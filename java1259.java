import java.util.*;
public class java1259 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            else {
                int r = 0;
                int a = n;

                while (n > 0) {
                    r = r * 10 + n % 10;
                    n /= 10;
                }

                if (a == r) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
