import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        int cnt = 0;

        while(true){
            if(n % x == 0){
                System.out.println("Yes");
                break;
            }
            else if(n < 0){
                System.out.println("No");
                break;
            }
            n = n - y;
            cnt++;
        }
    }
}