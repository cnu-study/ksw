import java.util.*;
public class java1978 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int ct = 0;

            for (int j = 1; j <= a; j++) {

                if(a % j == 0){
                    ct++;
                }
            }
            if(ct == 2){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
