import java.util.*;
public class java2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int a1 = a % 10;
        int a2 = a / 100;
        int a3 = a-(a2*100 + a1);

        int sum1 = a1 * 100 + a2 + a3;

        int b1 = b % 10;
        int b2 = b / 100;
        int b3 = b-(b2*100 + b1);

        int sum2 = b1 * 100 + b2 + b3;

        if(sum1 > sum2){
            System.out.println(sum1);
        }
        else{
            System.out.println(sum2);
        }
    }
}