package ifInFor;

import java.util.*;

public class IfinFor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        while(a <= b) {
            System.out.print(a + " ");
            if (a % 2 == 0) {
                a += 3;
            } else {
                a *= 2;
            }
            
        }
    }

}
