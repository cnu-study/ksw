import java.util.*;

public class java9086 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }
    }
}
