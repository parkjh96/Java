package infiniteLoop;

import java.util.*;

public class InfiniteLoop3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("John");
            } else if (n == 2) {
                System.out.println("Tom");
            } else if (n == 3) {
                System.out.println("Paul");
            } else if (n == 4) {
                System.out.println("Sam");
            } else {
                System.out.println("Vacancy");
                break;
            }

            /*
             * switch(n) { case 1: System.out.println("John"); continue; case 2:
             * System.out.println("Tom"); continue; case 3: System.out.println("Paul"); continue;
             * case 4: System.out.println("Sam"); continue; default: System.out.println("Vacancy");
             * break; }
             */
        }
    }

}
