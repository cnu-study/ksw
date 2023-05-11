import java.util.*;

public class java1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = 0;
        String[] space = s.split(" ");
        List<String> strList = new ArrayList<>(Arrays.asList(space));
        strList.remove("");
        space = strList.toArray(new String[0]);
        for (int i = 0; i < space.length; i++) {
            ans += 1;
        }
        System.out.println(ans);
    }
}