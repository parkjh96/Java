package repeatNtime;

import java.util.*;

public class RepeatNtime4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = a + b;
        for (int i = 0; i < b; i++) {
            System.out.println(ans);
            ans += b;
        }
    }

}
