package forInIf;

import java.util.*;

public class ForinIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = a; i > b - 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i > a - 1; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
