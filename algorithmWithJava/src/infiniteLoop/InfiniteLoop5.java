package infiniteLoop;
/*
 * 사각형의 가로세로의 길이와 문자가 주어집니다. 문자 C가 주어지는 줄까지 사각형의 넓이를 구하는 프로그램을 작성해보세요.

입력 형식
입력으로 몇 개의 줄이 들어올지는 정해져 있지는 않습니다. 각 줄에는 사각형의 가로세로 길이, 문자를 공백을 사이에 두고 주어집니다. 단, 문자 C가 반드시 한 번 이상 주어진다고 가정해도 좋습니다.

1 ≤ 가로, 세로 길이 ≤ 100
출력 형식
사각형의 넓이를 한 줄에 하나씩 출력합니다.

입출력 예제
예제1
입력:
4 8 Z
3 6 D
5 10 C
출력:
32
18
50
예제2
입력:
3 9 C
출력:
27
 */
import java.util.*;

public class InfiniteLoop5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String c = scanner.next();
            System.out.println(a * b);
            
            if (c.equals("C")) {
                break;
            }
        }

    }

}
