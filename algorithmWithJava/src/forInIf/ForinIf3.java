package forInIf;

import java.util.*;

public class ForinIf3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            System.out.print(0);
        }
    }

}
