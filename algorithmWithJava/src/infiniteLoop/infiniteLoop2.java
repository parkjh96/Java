package infiniteLoop;

import java.util.*;

public class infiniteLoop2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n > 25) {
                System.out.println("Lower");
            } else if (n < 25) {
                System.out.println("Higher");                
            } else {
                System.out.println("Good");
                break;
            }

        }
    }

}
