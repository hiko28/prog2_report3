package main.jp.ac.uryukyu.ie.e195735;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{

    int hp = getHitPoint();

    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP,attack);

        /*レポート３にて使用
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);

         */
    }

    @Override
    public void wounded(double damage) {
        hp -= damage;
        if (hp < 0) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }

/*レポート３にて使用
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
     */

    /*レポート３にて使用
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }
    */


    /**
     * getName
     * nameのgetterメソッド
     * @return name
     */

    /*レポート３にて使用
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     */


}
