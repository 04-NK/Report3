package jp.ac.uryukyu.ie.e245746;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    void attackTest(){
        int defaulWarriorAttack = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, defaulWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", 10 , 10);
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(0, slime.getHitPoint());

    }
}
