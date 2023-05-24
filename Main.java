import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer>[] stack = new Stack[7];
        int n = in.nextInt();
        int cnt = 1;
        for (int i = 1; i <= 6; i++) {
            stack[i] = new Stack<Integer>();
            stack[i].push(0);
        }

        stack[in.nextInt()].push(in.nextInt());

        for (int i = 1; i < n; i++) {
            int ln = in.nextInt();
            int fn = in.nextInt();

            while (stack[ln].peek() > fn) {
                stack[ln].pop();
                cnt++;
            }

            if (stack[ln].peek() != fn) {
                stack[ln].push(fn);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
