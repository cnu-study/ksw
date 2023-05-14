import java.util.*;
public class java2609 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;
        int d = b;
        int cnt = 0;
        while(true){
            cnt = a % b;
            if(cnt==0){
                System.out.println(b);
                System.out.println((c * d)/b);
                break;
            }
            else{
                a=b;
                b=cnt;
            }
        }

        
    }
}
