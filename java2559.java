import java.util.Scanner;

public class java2559 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int cnt = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if(cnt < sum){
                cnt = sum;
            }
        }

        System.out.println(cnt);
    }
}
