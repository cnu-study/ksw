import java.util.*;
public class java2475 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            int a = in.nextInt();
            cnt = cnt + (a*a);
        }
        System.out.println(cnt%10);
    }
}