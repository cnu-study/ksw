import java.util.*;
public class java2869 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int v = in.nextInt();
        int up = a - b;
        int day = (v - b) / up;
        if ((v - b) % up != 0){
            day++;
        } 
        System.out.println(day);
    }
}
