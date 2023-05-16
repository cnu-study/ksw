import java.util.*;
public class java14916 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        while(true){
            if(n % 5 == 0){
                System.out.println(n/5 + cnt);
                break;
            }
            else if(n < 0){
                System.out.println(-1);
                break;
            }
            n = n - 2;
            cnt++;
        }
    }
}