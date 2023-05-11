import java.util.*;
public class java1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];
        String a = in.next().toUpperCase();
        int cnt = -1;
        char q = '?';
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 65]++;
            if(cnt<arr[a.charAt(i) - 65]){
                cnt = arr[a.charAt(i) - 65];
                q = a.charAt(i);
            }
            else if(cnt==arr[a.charAt(i) - 65]){
                q='?';
            }
        }
        System.out.println(q);
    }
}