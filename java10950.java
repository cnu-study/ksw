import java.util.Scanner;

public class java10950
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();

        for(int i=1;i<=n;i++)
        {
            int a = ac.nextInt();
            int b = ac.nextInt();
            System.out.println(a+b);
        }

        ac.close();
    }
}