import java.util.Scanner;

public class java25304
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int x = ac.nextInt();
        int n = ac.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++)
        {
            int a = ac.nextInt();
            int b = ac.nextInt();

            cnt = cnt + a * b;
        }
        if(cnt == x)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        ac.close();
    }
}