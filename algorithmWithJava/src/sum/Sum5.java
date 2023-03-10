package sum;

/**
 * 정수 a, b가 주어지면, a와 b를 포함하여 a와 b 사이의 수 중 5의 배수만을 합하여 출력하는 프로그램을 작성해보세요.
 * 
 * 입력 형식 정수 a, b를 공백을 사이에 두고 입력받습니다.
 * 
 * 1 ≤ a, b ≤ 200 출력 형식 첫 번째 줄에 a와 b를 포함하여 a와 b 사이의 수 중 5의 배수를 전부 더했을 때의 결과를 출력합니다.
 * 
 * 입출력 예제 예제1 입력:
 * 
 * 13 50 출력:
 * 
 * 260 예제2 입력:
 * 
 * 50 13 출력:
 * 
 * 260
 */
import java.util.*;

public class Sum5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sumVal = 0;
        if (a < b) {
            for (int i = a; i < b + 1; i++) {
                if (i % 5 == 0) {
                    sumVal += i;
                }
            }
        } else {
            for (int i = b; i < a + 1; i++) {
                if (i % 5 == 0) {
                    sumVal += i;
                }
            }
        }
        System.out.println(sumVal);

    }

}
