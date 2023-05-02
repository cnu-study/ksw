import java.util.Scanner;
public class java10871 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = in.nextInt();
            if(a[i] < x)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
    }
}

