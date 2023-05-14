import java.util.*;
public class java1009
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int a,b,r;
		for(int j=0;j<T;j++) {
			a=in.nextInt();
			b=in.nextInt();
			r=1;
			
			for (int i=0;i<b;i++){
                r=(r*a)%10;
            } 
			if(r==0) r=10;
			System.out.println(r);
		}
    }
}