import java.util.Scanner;

public class java8958 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String a = in.next();
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
