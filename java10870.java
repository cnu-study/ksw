import java.util.*;
public class java10870 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        System.out.println(fibo(f));
        
    }
    public static int fibo(int f)
    {
        if(f == 1 || f == 2){
            return 1;
        }
        else if(f == 0){
            return 0;
        }
        else{
            return fibo(f-1) + fibo(f-2);
        }
    }
}
