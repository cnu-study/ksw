import java.util.Scanner;

public class java2753
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }

        ac.close();
    }
}