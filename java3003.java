import java.util.*;
public class java3003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        int[] cop = {1,1,2,2,2,8};
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
            int cnt = 0;
            while (true){
                if(arr[i] != cop[i]){
                    if(arr[i] > cop[i]){
                        arr[i]--;
                        cnt--;
                    }
                    else if(arr[i] < cop[i]){
                        arr[i]++;
                        cnt++;
                    }
                }
                else{
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}