import java.util.*;
public class java1037
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int max = -1;
		int min = 100000;
		for (int i = 0; i < T; i++) {
            int N = in.nextInt();
			max = N > max ? N : max;
			min = N < min ? N : min;
        }
		System.out.println(max * min);
    }
}