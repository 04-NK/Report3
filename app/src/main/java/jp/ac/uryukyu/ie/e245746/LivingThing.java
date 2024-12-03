package jp.ac.uryukyu.ie.e245746;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    
    LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAttack() {
        return attack;
    }
    
    public boolean isDead(){
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    
    public void attack(LivingThing opponent){
        if (this.hitPoint > 0){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }    
    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint <= 0) {
            hitPoint = 0;  
            dead = true; 
            System.out.printf("%sは倒れた。\n", name);   
        }
    }
}
