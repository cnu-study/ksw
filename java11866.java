import java.util.*;
public class java11866 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            deque.addFirst(i+1);
        }
        while (true){
            if(deque.size() == 1)
            {
                System.out.println(deque.peek());
                break;
            }
            else{
                cnt++;
                if(cnt % k == 0){
                    deque.addLast(deque.getFirst());
                    deque.remove();
                    System.out.println(deque.peek());
                }
                else{
                    deque.addLast(deque.getFirst());
                    deque.remove();
                }
            }
        }
    }
}

