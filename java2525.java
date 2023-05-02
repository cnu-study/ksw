import java.util.Scanner;

public class java2525
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int h = ac.nextInt();
        int m = ac.nextInt();
        int c = ac.nextInt();

        int cnt = (m + c) / 60;

        int M = m+c-(60*cnt);
        if(cnt < 1) {
            System.out.printf("%d %d",h,m+c);
        }
        else{
            if(cnt >= 1) {
                if(h + cnt >= 24) {
                    System.out.printf("%d %d",h + cnt - 24,M);
                }
                else {
                    System.out.printf("%d %d", h + cnt, M);
                }
            }
        }

        ac.close();
    }
}