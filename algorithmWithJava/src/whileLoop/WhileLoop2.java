package whileLoop;

import java.util.*;

public class WhileLoop2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (i < n) {
            System.out.print((i + 1) + " ");
            i++;
        }
    }

}
