import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int mid=(a.length()/2);
        int cnt=1;
        for(int i=0;i<mid;i++) {
            if(a.charAt(i)!=a.charAt(a.length()-1-i)) {
                cnt=0;
            }
        }

        System.out.println(cnt);
    }
}
