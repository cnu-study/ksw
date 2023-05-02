import java.util.Scanner;

public class java14681
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int x = ac.nextInt();
        int y = ac.nextInt();

        if (x > 0)
        {
            if(y > 0)
            {
                System.out.print("1");
            }
            if(y < 0)
            {
                System.out.print("4");
            }
        }
        else{
            if (x < 0)
            {
                if(y > 0)
                {
                    System.out.print("2");
                }
                if(y < 0)
                {
                    System.out.print("3");
                }
            }
        }
        ac.close();
    }
}