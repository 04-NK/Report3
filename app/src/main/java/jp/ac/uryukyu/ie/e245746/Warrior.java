package jp.ac.uryukyu.ie.e245746;

public class Warrior extends LivingThing {

    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (super.getHitPoint() > 0) {
            int damage = (int)(super.getAttack() * 3/2);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", super.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}