import java.util.*;
public class java9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String bae = in.next();
            int cnt = 0;
            for (int j = 0; j < bae.length(); j++) {
                char c = bae.charAt(j);
                if (c == '(') {
                    cnt = cnt + 1;
                } else if (c == ')') {
                    cnt = cnt - 1;
                }
            }

            if(cnt == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
