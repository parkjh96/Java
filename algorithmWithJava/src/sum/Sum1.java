package sum;

import java.util.*;

public class Sum1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumVal = 0;
        for (int i = a; i < b + 1; i++) {
            sumVal += i;
        }
        System.out.println(sumVal);

    }

}
