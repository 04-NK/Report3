import jp.ac.uryukyu.ie.e245746.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        System.out.println("名前: " + warrior.getName());
        System.out.println("HP: " + warrior.getHitPoint());
        System.out.println("攻撃力: " + warrior.getAttack());
        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}
