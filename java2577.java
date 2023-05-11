import java.util.*;
public class java2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 1;
        int n = 0;
        for (int i = 0; i < 3; i++) {
            int a = in.nextInt();
            cnt = cnt * a;
        }
        int[] arr = new int[10];

        int sum = cnt;

        while (sum > 0)
        {
            sum = sum / 10;
            n++;
        }

        for (int i = 0; i < n; i++) {
            arr[cnt % 10]++;
            cnt = cnt / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}