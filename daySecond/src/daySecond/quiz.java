package daySecond;
import java.util.Scanner;
public class quiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String sumName = "";
        // n번 이름 입력
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            sumName += name;
        }
        System.out.println(sumName);
        
    }

}
