import jp.ac.uryukyu.ie.e245720.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 100, 30);
        Enemy enemy = new Enemy("スライム", 50, 20);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while(warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }

        System.out.println("戦闘終了");
    }
}
