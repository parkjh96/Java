package prod;

import java.util.*;

public class Prod4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = 1;
        
        for (int i = 1; i < b + 1; i++) {
            if (i % a == 0) {
                prod *= i;
            }
        }
        System.out.println(prod);
    }

}
