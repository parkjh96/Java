package whileLoop;

import java.util.*;

public class WhileLoop9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        int i = b;
        while (i > a - 1) {
            System.out.print(i + " ");
            i -= 2;
        }
    }

}
