package cnt;

import java.util.*;

public class Cnt1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
       
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            if (n % 2 != 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
        
        

    }

}
