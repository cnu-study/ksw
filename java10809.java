import java.util.Scanner;
public class java10809 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String n = in.nextLine();
        int[] arr = new int[al.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if(n.charAt(i) == al[j].charAt(0)){
                    if(arr[j] == -1)
                    {
                        arr[j] = i;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
