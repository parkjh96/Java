package daySecond;

public class condloop {

    public static void main(String[] args) {
        // 3-1 변수 weight의 값이 60과 같다
        int weight;
        if (weight == 60) {
            
        }
        int age1
        int age2;
        // 변수 age1과 age2의 합계를 2배 한 것이 60을 넘는다
        if (2 * (age1 + age2) > 60) {
            
        }
//        int age = 1;
        // 변수 age가 홀수다
        if (age % 2 != 0) {
            
        }
        
        int age = 10;
        boolean isOdd = age % 2 == 1;
        boolean isEven = !isOdd;
        
        
        String name = "name";
        // 변수 name에 저장된 문자열이 "스마트"와 같다
        if (name.equals("스마트")) {
            
        }
//      ------------------------------------------------------------------        
        // 3-2 다음 중 조건식(if문의)으로 사용 할 수 있는 것을 고르시오
        double cost;
        if (cost = 300 * 1.05) {
            
        }
        if (3) {
            
        }
        if (age != 30) {
            
        }
        if (true) {
            
        }
        int b = 0;
        if (b+5 < 20) {
            
        }
//        boolean gender = false;
        if (gender = true) { // 되기는 되지만 사실상 의미가 없다. 걍 쓰지마
            
        }
//        ------------------------------------------------------------------
        // 3-3 Java 프로그램으로 작성하시오
        /**
            1. int형 변수 gender 를 선언하고, 0 또는 1을 대입한다 (어떤 것이라도 상관없음)
               또한, int 형 변수 age 를 선언하고, 적당한 숫자를 대입한다.
            2. 화면에 “안녕하세요” 를 표시한다
            3. 만약 변수 gender 가 0이면 “나는 남자입니다", 그렇지 않으면 “나는 여자입니다" 를 표시한다
            4. 만약 변수 gender 가 남자이면 age 변수의 값을 표시하고, 뒤에 “살입니다" 를 붙여서 표시한다.
            5. 마지막에 “잘 부탁합니다" 를 표시한다

         */
        int gender = 0;
        int age = 1;
        System.out.println("안녕하세요");
        
        if (gender == 0) {
            System.out.println("나는 남자입니다");
            System.out.println(age + "살입니다");
        } else {
            System.out.println("나는 여자입니다");
        }
        
        System.out.println("잘 부탁합니다");
        
//      ------------------------------------------------------------------
        // 3-4
        
       boolean clear = true;
       if (clear == true) {
           System.out.println("세탁을 한다");
           System.out.println("산책을 한다");
       } else {
           System.out.println("영화를 본다");
           System.out.println("잔다");
       }
       // 중괄호 항상 쓰는 습관
//      ------------------------------------------------------------------
        // 3-5
       /**
        1. 화면에 “[메뉴] 1:검색 2:등록 3:삭제 4:변경 >” 을 표시한다
        2. 키보드로 숫자를 입력하고, 변수 selected 에 대입한다.
        3. 만약 변수 selected 가 1 이면 “검색합니다", 2이면 “등록합니다", 3이면 “삭제합니다", 4이면 “변경합니다"를 표시한다
        4. selected 가 1 부터 4 사이의 값이 아니라면 아무것도 하지 않는다

        */
       System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경>");
       int selected = new java.util.Scanner(System.in).nextInt();
       switch (selected) {
           case 1:
               System.out.println("검색합니다");
               break;
           case 2:
               System.out.println("등록합니다");
               break;
           case 3:
               System.out.println("삭제합니다");
               break;
           case 4:
               System.out.println("변경합니다");
               break;
           default:
               return;
       }
        
//      ------------------------------------------------------------------
       /**3-6
        다음 조건에 만족하는 프로그램을 작성하시오
        1. 화면에 “[숫자 맞추기 게임]” 을 표시한다
        2. 0 부터 9 까지의 정수 중에서 랜덤하게 수를 1개 생성해서 변수 ans 에 대입한다
        3. for 문을 이용해 “5회 반복 하는 루프"를 만든다. 아래의 4. ~ 7. 은 루프 안에 기술 한다
        4. 화면에 “0 ~ 9 사이의 숫자를 입력 하세요” 를 표시한다
        5. 숫자를 입력해, 변수 num 에 대입한다
        6. 만약 변수 num 이 변수 ans 와 같으면 “정답!” 이라고 화면에 표시하고 반복을 종료
        7. 만약 변수 num 이 변수 ans 와 같지 않으면 “다릅니다"를 표시한다
        8. 반복 블록의 바깥에, “게임을 종료합니다" 라고 화면에 표시한다
       */
       
       System.out.println("[숫자 맞추기 게임]");
       int ans = new java.util.Random().nextInt(10);
       
       for (int i = 0; i < 5; i++) {
           System.out.println("0 ~ 9 사이의 숫자를 입력 하세요");
           int num = new java.util.Scanner(System.in).nextInt();
           if (ans == num) {
               System.out.println("정답!");
               break;
           } else {
               System.out.println("다릅니다");
           }
       }
       System.out.println("게임을 종료합니다");
    }

}
