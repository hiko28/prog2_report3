package main.jp.ac.uryukyu.ie.e195735;

public class Warrior extends LivingThing{
    int hp = getHitPoint();

    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    @Override
    public void wounded(double damage) {
        hp -= damage;
        if (hp < 0) {
            setDead(true);
            System.out.printf("戦士%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

    /*public void attackWithWeponSkill(int attack) {
        double damage = attack * 1.5;
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), damage);


    }*/
}
