package forInIf;

import java.util.*;

public class ForinIf1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        int n = scanner.nextInt();
        
        if (c.equals("A")) {
            for (int i = 0; i < n; i++) {
                System.out.print(i + 1 + " ");
            } 
        } else {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }

}
