package dayThird;

public class DayThirdQuiz {

    public static void main(String[] args) {
        // // 1. int형 값을 4개 담을 수 있는 배열 points
        // int[] points = new int[4];
        // // 2. double형 값을 5개 담을 수 있는 배열 weights
        // double[] weights = new double[5];
        // // 3. boolean형 값을 3개 담을 수 있는 배열 answers
        // boolean[] answers = new boolean[3];
        // // 4. String형 값을 3개 담을 수 있는 배열 names
        // String[] names = new String[3];

        // --------------------------------------------------------------------------

        // // 3개의 계좌 잔액 "121902, 8302, 55100이 담겨 있는 int형 배열 moneyList를 선언하시오
        // int[] moneyList = {121902, 8302, 55100};
        // // 그 배열의 요소를 1개씩 for문ㅇ로 꺼내서 화면에 표시하시오
        // for (int i = 0; i < moneyList.length; i++) {
        // System.out.println(moneyList[i]);
        // }
        // // 같은 배열 요소를 foreach문으로 1개씩 꺼내서 화면에 표시하시오
        // for (int money : moneyList) {
        // System.out.println(money);
        // }
        // --------------------------------------------------------------------------

        // // 각 라인에서 발생하는 예외의 이름을 답하시오
        // int[] counts = null;
        // float[] heights = {171.3f, 175.0f};
        // System.out.println(counts[1]); // NullPointerException -> 참조하려는 주소가 null익 때문에 반환할 수 없음
        // System.out.println(heights[2]); // ArrayIndexOutofBoundsException -> heights의 배열크기는 2개로
        // // 1번까지만 참조 가능 -> 배열의 크기보다 큰 값 요구
        // ---------------------------------------------------------------------------


        /**
         * 다음 4개의 조건에 맞는 "숫자 맞추기 퀴즈" 프로그램을 작성하시오 
         * 1. 3개짜리 int형 배열 numbers를 준비하시오. 이 때 초기화는 각각 3, 4, 9로 합니다 
         * 2. 화면에 "1자리의 숫자를 입력 해 주세요" 라고 표시합니다 
         * 3. int input = new java.util.Scanner(System.in).nextInt(); 대입 
         * 4. input값이 3, 4, 9 중 하나와 같다면 "정답!" 이라고 표시합니다
         */

        int[] numbers = { 3, 4, 9 };
        System.out.println("1자리의 숫자를 입력 해 주세요");
        int input = new java.util.Scanner(System.in).nextInt();
        
        for (int number : numbers) {
            if (number == input) {
                System.out.println("정답!");
            }
        }

    }

}
