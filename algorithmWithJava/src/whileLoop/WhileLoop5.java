package whileLoop;

import java.util.*;

public class WhileLoop5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        while (i < n + 1) {
            if (i % 3 == 0) {
                System.out.print(i + " ");                
            }
            i++;
        }
    }

}
