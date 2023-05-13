import java.util.*;
public class java5597 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[31];

        for(int i=1; i<29; i++) {
            int n = in.nextInt();
            arr[n] = 1;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!=1)
                System.out.println(i);
        }
    }
}