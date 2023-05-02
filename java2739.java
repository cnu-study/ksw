import java.util.Scanner;

public class java2739
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();

        for(int i=1;i<=9;i++)
        {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        ac.close();
    }
}