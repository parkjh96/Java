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
        
        kinoko1.run();*/
        
        Cleric cleric = new Cleric();
        cleric.name = "클레릭";
//        cleric.hp = 100;
//        cleric.mp = 100;
//        cleric.selfAid();
//        cleric.pray(10);
        
        System.out.println("성직자의 이름은 " + cleric.name);
        System.out.println("성직자의 체력은 " + cleric.hp);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);
        cleric.hp = 10;
        System.out.println("성직자의 체력은 " + cleric.hp);
        cleric.selfAid();
        System.out.println("성직자의 체력은 " + cleric.hp);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);
        cleric.pray(6);
        System.out.println("성직자의 현재 마력은 " + cleric.mp);
        
    }

}
