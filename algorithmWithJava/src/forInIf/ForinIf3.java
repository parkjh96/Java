package forInIf;
/**
 * 두 정수 a와 b를 입력받아, a가 자연수라면 a를 b번 반복하여 출력하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 정수 a와 b가 공백을 두고 주어집니다.

-9 ≤ a ≤ 9

1 ≤ b ≤ 50

출력 형식
첫 번째 줄에 a가 자연수라면 a를 b번 반복하여 공백없이 출력합니다.

만약 a가 0이하라면 0을 출력합니다.
 */
import java.util.*;

public class ForinIf3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 0) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            System.out.print(0);
        }
    }

}
