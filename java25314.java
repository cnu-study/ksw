import java.util.Scanner;
public class java25314
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int x = ac.nextInt();

        for(int i=1;i<=x/4;i++)
        {
            System.out.print("long ");
        }
        System.out.print("int");
        ac.close();
    }
}