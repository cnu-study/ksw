import java.util.*;
public class java1934
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = a;
            int d = b;
            int cnt = 0;
            while(true){
                cnt = a % b;
                if(cnt==0){
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
}