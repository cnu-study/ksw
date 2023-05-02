import java.util.Scanner;
public class java11021
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int t = ac.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a = ac.nextInt();
            int b = ac.nextInt();
            System.out.printf("Case #%d: %d\n",i,a+b);
        }
        ac.close();
    }
}