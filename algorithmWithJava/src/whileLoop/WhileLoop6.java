package whileLoop;

import java.util.*;

public class WhileLoop6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while (a < b + 1) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        }
    }

}
