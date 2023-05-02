import java.util.Scanner;

public class java8393
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            cnt = cnt + i;
        }
        System.out.println(cnt);
        ac.close();
    }
}