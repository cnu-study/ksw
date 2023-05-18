
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int [9];

        for (int i = 0; i < 9; i++) {
            a [i] = sc.nextInt();
        }

        int b[] = new int [9];

        for (int i = 0; i < 9; i++) {
            b[i] = a[i];
        }

        Arrays.sort(a);

        System.out.println(a[8]);

        for (int i = 0; i < 9; i++) {
            if (b[i] == a[8]) {
                System.out.println(i+1);
            }

        }
    }
}   