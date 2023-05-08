import java.util.*;

public class java10773 {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = 0;

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            if(k==0){
                if(stack.size() != 0){
                    cnt -= stack.peek();
                    stack.pop();
                }
                else{
                    cnt -= 0;
                }
            }
            else{
                stack.push(k);
                cnt += stack.peek();
            }

        }
        System.out.println(cnt);
    }
}
