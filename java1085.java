import java.util.*;
public class java1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int cntx = 0;
        int cnty = 0;

        if(x < w-x){
            cntx = x;
        }
        else{
            cntx = w-x;
        }
        if(y < h-y){
            cnty = y;
        }
        else{
            cnty = h-y;
        }

        if(cntx > cnty){
            System.out.println(cnty);
        }
        else{
            System.out.println(cntx);
        }
    }
}