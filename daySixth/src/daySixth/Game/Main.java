package daySixth.Game;

public class Main {

    public static void main(String[] args) {
//        int i = 10;
        /*
        Hero hero = new Hero();
        hero.name = "슈퍼맨";
        hero.hp = 100;
                
        Kinoko kinoko1 = new Kinoko();
        kinoko1.hp = 50;
        kinoko1.suffix = 'A';
        
        Kinoko kinoko2 = new Kinoko();
        kinoko2.hp = 50;
        kinoko2.suffix = 'B';
        
        hero.sit(10);
        hero.slip();
        hero.sleep();
        
        kinoko1.run();
        
        Cleric cleric = new Cleric();
        cleric.name = "클레릭";
        
        System.out.println("성직자의 이름은 " + cleric.name);
        System.out.println("성직자의 체력은 " + cleric.hp);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);
        cleric.hp = 10;
        System.out.println("성직자의 체력은 " + cleric.hp);
        cleric.selfAid();
        System.out.println("성직자의 체력은 " + cleric.hp);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);
        cleric.pray(6);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);*/
        /*
        Hero hero1 = new Hero();
//        hero1.name = "스랄";
//        hero1.hp = 100;
        Hero hero2 = new Hero("아서스");
//        hero2.name = "아서스";
        Hero hero3 = new Hero("쓰랄", 200);

        Hero.money = 100;
        
        System.out.println(Hero.money);
        System.out.println(hero2.money);
        
        
        Wizard wizard = new Wizard();
        wizard.name = "제이나";
        wizard.hp = 50;
        wizard.heal(hero1);
        wizard.heal(hero2);
        
        // String이 만들어지는 구조
        // String은 너무 자주 쓰이기에 클래스임에도 불구하고 import할 필요가 없고 new로 객체 생성을 따로 하지 않아도 되게끔 자바에서 제공한다
        char[] chars = {'a', 'b', 'c'};
        String str = new String(chars);*/
        
        Cleric cleric = new Cleric("아서스", 40, 5);
        System.out.println(cleric.name + cleric.hp + cleric.mp);
    }

}
