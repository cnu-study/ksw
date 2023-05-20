import java.util.*;
public class java2576 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 1000;
        int sum = -1;
        for (int i = 0; i < 7; i++) {
            int a = in.nextInt();
            if(a % 2 != 0){
                sum = sum + a;
                if(a < cnt){
                    cnt = a;
                }
            }
        }
        if(sum == -1){
            System.out.println(sum);
        }
        else{
            System.out.println(sum+1);
            System.out.println(cnt);
        }

    }
}