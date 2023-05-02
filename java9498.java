import java.util.Scanner;

public class java9498
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();

        if(a>=90){
            System.out.print("A");
        }
        if(89>=a && a>=80){
            System.out.print("B");
        }
        if(79>=a && a>=70){
            System.out.print("C");
        }
        if(69>=a && a>=60){
            System.out.print("D");
        }
        else if(a<60){
            System.out.print("F");
        }
        ac.close();
    }
}