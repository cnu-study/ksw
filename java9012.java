import java.util.*;

public class java9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String string = sc.next();
            Stack st = new Stack();
            boolean success = true;
            for (int j = 0; j < string.length(); j++) {
                char ch = string.charAt(j);
                if ( ch == ')' ) {

                    if (st.empty() == true) {
                        success = false;
                    }
                    else {
                        st.pop();
                    }

                }
                else if (ch =='(') {
                    st.push('(');
                }
            }
            if (st.empty() == false) {
                success = false;
            }

            if (success == true) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}