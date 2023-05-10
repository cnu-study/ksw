import java.util.Scanner;
public class java2675
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            String arr = in.next();
            for (int j = 0; j < arr.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(arr.charAt(j));
                }
            }
            System.out.println();
        }
    }
}