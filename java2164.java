import java.util.*;
public class java2164 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;

        for (i = n; i >= 1; i--) {
            deque.addFirst(i);
        }

        while (true) {
            i++;
            if (deque.size() == 1){
                break;
            }
            else if (i % 2 != 0) {
                deque.remove();
            } else if (i % 2 == 0) {
                deque.addLast(deque.getFirst());
                deque.remove();
            }
        }
        System.out.println(deque.getFirst());
    }
}

