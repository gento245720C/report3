package jp.ac.uryukyu.ie.e245720;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        Warrior warrior = new Warrior("テスト戦士", 100, 20);
        Enemy dummyEnemy = new Enemy("ダミー敵", 100, 10); 

        // 3回攻撃し、各回のダメージが攻撃力の150%になっているか確認
        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int) (warrior.getAttack() * 1.5);
            int initialHp = dummyEnemy.getHitPoint();
            warrior.attackWithWeponSkill(dummyEnemy);
            assertEquals(initialHp - expectedDamage, dummyEnemy.getHitPoint());
        }
    }
}
