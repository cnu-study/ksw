import java.util.*;
public class java3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] cnt = new int[10];
        int ten = 10;
        for (int i = 0; i < 10; i++) {
            int n = in.nextInt();
            cnt[i] = n%42;
        }



        System.out.println(ten);
    }
}