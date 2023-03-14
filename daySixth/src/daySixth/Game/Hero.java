package daySixth.Game;

public class Hero { // Pascal case + 명사
    // field variable, global variable, member variable, property
    // camel case + 명사
    String name;
    int hp;
    Sword sword;
    static int money;
    // field variable, global variable, member variable, property
    
    // 기본 생성자 primary constructor
    Hero(){
        this("이름 없음");
    }
    // 생성자 오버로드
    Hero(String name){
        this.name = name;
        this.hp = 100;
        sword = new Sword();
    }
    
    Hero(String name, int hp){
        this.name = name;
        this.hp = 100;
        sword = new Sword();
    }
    
    /*
    // 메소드 camel case + 동사
    void attack() {
        System.out.println(this.name + "는 공격했다");
        System.out.println("적에게 5포인트의 데미지를 주었다");
    }

    void run() {
        System.out.println(this.name + "는 도망쳤다");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + this.hp + " 입니다");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "는(은) " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }
    
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는(은) 넘어졌다");
        System.out.println("5의 데미지!");
    }
    
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는(은) 잠을 자고 회복했다!");
    }*/
}
