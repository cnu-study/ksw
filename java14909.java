import java.util.Scanner;

public class java14909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}