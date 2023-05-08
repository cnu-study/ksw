import java.util.*;

public class Main {

    public static Stack<Integer> stack = new Stack<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String st = sc.next();
            if(st.equals("push")){
                int a = sc.nextInt();
                stack.push(a);
            }
            else if(st.equals("top"))
            {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
            }
            else if(st.equals("size"))
            {
                sb.append(stack.size()).append('\n');
            }
            else if(st.equals("empty"))
            {
                sb.append(stack.isEmpty() ? 1 : 0).append('\n');
            }
            else if(st.equals("pop"))
            {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
