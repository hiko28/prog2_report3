package main.jp.ac.uryukyu.ie.e195735;


public class Enemy extends LivingThing {

    int hp = getHitPoint();

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

        /*レポート３にて使用
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);

         */
    }

    public void wounded(int damage){
        hp -= damage;
        if( hp < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }



    /*レポート３にて使用
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
     */

/*レポート３にて使用
    public void attack(Hero hero){
        if (dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }

 */
}

