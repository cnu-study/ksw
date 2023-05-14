import java.util.*;

public class java1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        Arrays.sort(arr1);

        for (int i = 0; i < arr2.length; i++) {
            int low = 0;
            int high = n - 1;
            int cnt = 0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr1[mid] == arr2[i]) {
                    cnt = 1;
                    break;
                } else if (arr1[mid] < arr2[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(cnt);
        }
    }
}
