package prod;

import java.util.*;

public class Prod2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = 1;

        for (int i = 0; i < b; i++) {
            prod *= a;
        }
        System.out.println(prod);

    }

}
