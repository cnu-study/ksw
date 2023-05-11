import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr = in.nextLine();
        int cnt = 1;
        for (int i = 1; i < arr.length()-1; i++) {
            if(arr.charAt(i) == ' ' && arr.charAt(i-1) != ' ' && arr.charAt(i+1) != ' '){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
