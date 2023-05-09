import java.util.*;

public class java18258 {

    Queue<Integer> queue = new LinkedList<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String st = sc.next();
            if(st.equals("push")){
                int a = sc.nextInt();
                queue.push(a);
            }
            else if(st.equals("top"))
            {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
            }
            else if(st.equals("size"))
            {
                sb.append(queue.size()).append('\n');
            }
            else if(st.equals("empty"))
            {
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            }
            else if(st.equals("pop"))
            {
                sb.append(queue.isEmpty() ? -1 : queue.pop()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
