package test.jp.ac.uryukyu.ie.e195735;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.jp.ac.uryukyu.ie.e195735.*;


public class WarriorTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 500, 100);
        for (int i=0; i<3; i++) {
            demoWarrior.attackWithWeponSkill(slime);
        }
        slime.attack(demoWarrior);
        assertEquals(defaultHeroHp, demoWarrior.getHitPoint());
    }
}
