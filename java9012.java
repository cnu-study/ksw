import java.util.*;
public class java9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String bae = in.next();
            for (int j = 0; j < bae.length(); j++) {
                char c = bae.charAt(j);
                if(c=='('){
                    stack.push(c);
                }
                else if (stack.empty()) {
                    System.out.println("NO");
                }
            }
        }
        if (stack.empty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}