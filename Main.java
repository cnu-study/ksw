import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        int n = in.nextInt();
        int a = n/10;
        int b = n%10;
        int f = 0;

        if(n == 0){
            System.out.println(n);
        }else{
            while(true){
                if(n==f){
                    System.out.println(cnt);
                    break;
                }
                else{
                    sum = a + b;
                    if(sum>=10){
                        sum = sum % 10;
                    }
                    a = b;
                    b = sum;
                    f = a*10 + b;
                }
                cnt++;
            }
        }
    }
}
