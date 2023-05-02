import java.util.Scanner;

public class java2480
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a1 = ac.nextInt();
        int a2 = ac.nextInt();
        int a3 = ac.nextInt();

        int a4;

        for(int i=1;i<5;i++)
        {
            if(a1 < a2)
            {
                a4 = a2;
                a2 = a1;
                a1 = a4;
            }
            if(a1 < a3)
            {
                a4 = a3;
                a3 = a1;
                a1 = a4;
            }
            if(a2 < a3)
            {
                a4 = a3;
                a3 = a2;
                a2 = a4;
            }
        }

        if(a1 == a2)
        {
            if(a2 == a3)
            {
                System.out.printf("%d",10000 + 1000 * a1);
            }
            if(a2 != a3)
            {
                System.out.printf("%d",1000 + 100 * a1);
            }
        }
        else {
            if(a2 == a3)
            {
                System.out.printf("%d",1000 + 100 * a2);
            }
            if(a2 != a3)
            {
                System.out.printf("%d",100 * a1);
            }
        }

        ac.close();
    }
}