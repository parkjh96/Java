package sum;
/*
 * 100 이하의 정수 n을 입력받은 후, n부터 100까지의 합을 구하는 프로그램을 작성해보세요.

입력 형식
첫 번째 줄에 n이 주어집니다.

1 ≤ n ≤ 100
출력 형식
첫 번째 줄에 n부터 100까지의 합을 출력합니다.

입출력 예제
예제1
입력:

91
출력:

955
 */
import java.util.*;

public class Sum2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sumVal = 0;
        
        for (int i = a; i < 101; i++) {
            sumVal += i;
        }
        System.out.println(sumVal);
    }

}
