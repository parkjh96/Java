package continueEx;

import java.util.*;

public class continue1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }

}
