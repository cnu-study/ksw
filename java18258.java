import java.util.*;
public class java18258 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Deque<String> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String st = sc.next();
            if(st.equals("push")){
                int a = sc.nextInt();
                queue.add(a);
            }
            else if(st.equals("front"))
            {
                sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
            }
            else if(st.equals("back"))
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
                sb.append(queue.isEmpty() ? -1 : queue.remove()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
