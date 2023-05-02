import java.util.Scanner;

public class java2884
{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int h = ac.nextInt();
        int m = ac.nextInt();

        int M = m-45+60;
        if(m >= 45) {
            System.out.printf("%d %d",h,m-45);
        }
        else{
            if(m < 45) {
                if(h == 0){
                    System.out.printf("23 %d",M);
                }
                else {
                    System.out.printf("%d %d", h - 1, M);
                }
            }
        }

        ac.close();
    }
}