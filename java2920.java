import java.util.Scanner;

public class java2920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        if (arr[0] == 1) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] >= arr[i]) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        } else if (arr[0] == 8) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] <= arr[i]) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
