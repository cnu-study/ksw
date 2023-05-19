
import java.util.*;
public class java2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int cnt = (m+n)/60;
        if(m + n < 60){
            System.out.printf("%d %d",h,m+n);
        }
        else if(m + n >=60){
            if(cnt + h < 24){
                System.out.printf("%d %d",h + cnt,m+n - 60*cnt);
            }
            else if(cnt + h >= 24){
                System.out.printf("%d %d",h + cnt - 24,m+n - 60*cnt);
            }
        }
    }
}   