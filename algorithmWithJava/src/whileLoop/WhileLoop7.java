package whileLoop;
/**
 * 
 * @author JUNHA
 *while문을 사용해 26부터 10까지 1씩 감소하며 출력하는 프로그램을 작성해보세요.

입력 형식
입력이 주어지지 않습니다.

출력 형식
숫자 사이에 공백을 두고 출력합니다.

입출력 예제
예제1
입력:

출력:

26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10
 */
public class WhileLoop7 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 26;
        while (i > 9) {
            System.out.print(i + " ");
            i--;
        }
    }

}
