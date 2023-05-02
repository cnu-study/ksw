import java.util.Scanner;
public class java2588
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        int b = ac.nextInt();
        int b1 = (b / 100);//3
        int b2 = (b / 10) - (b1*10);//8
        int b3 = b - b1*100 - b2*10;//5



        System.out.println(a*b3);//3
        System.out.println(a*b2);//4
        System.out.println(a*b1);//5
        System.out.println(a*b);//6

        ac.close();
    }
}