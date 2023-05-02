import java.util.Scanner;

public class java1330 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        int b = ac.nextInt();
        if(a>b){
            System.out.print(">");
        }
        if(a<b){
            System.out.print("<");
        }
        if(a==b){
            System.out.print("==");
        }
        ac.close();
    }
}
