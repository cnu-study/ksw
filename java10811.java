import java.util.*;
public class java10811 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == b){
                continue;
            }
            else{

                for (int j = 0; j < (b - a + 1) / 2; j++) {
                    int tmp = arr[a - 1 + j];
                    arr[a - 1 + j] = arr[b - 1 - j];
                    arr[b - 1 - j] = tmp;
                }

            }
        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}