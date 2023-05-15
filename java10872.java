import java.util.*;
public class java10872 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        System.out.println(fac(f));
        
    }
    public static int fac(int f)
    {
        if(f==0 || f == 1){
            return 1;
        }
        else{
            return f * fac(f-1);
        }
    }
}
