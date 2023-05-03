import java.util.*;

public class java10828 {

    public static Stack<Integer> stack = new Stack<>();

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
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
            else if(st.equals("size"))
            {
                System.out.println(stack.size());
            }
            else if(st.equals("empty"))
            {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if(st.equals("pop"))
            {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
        }


    }
}