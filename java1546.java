import java.util.*;
public class java1546 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int  ar [] = new int[N];

        for (int i = 0; i < N; i++) {
            ar [i] = in.nextInt();

        }

        Arrays.sort(ar);


        float br [] = new float[N];
        float sum = 0;


        for (int i = 0; i < N; i++) {
            br[i] = (float)ar[i]/ar[N-1]*100;
            sum = sum + br[i];

        }


        float c = sum/N;


        System.out.println(c);
    }
}
