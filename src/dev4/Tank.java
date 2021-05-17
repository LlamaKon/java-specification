package dev4;

public class Tank extends Weapon implements ICar, ICannon {

    // コンストラクタ
    public Tank() {
        super("戦車");
    }


    /*  ICannonの抽象メソッドを実装

            射撃メソッド
     */
    public void fire() {
        System.out.println("砲撃");
    }

    /*  ICarの抽象メソッドを実装

            移動メソッド
     */

    public void move() {
        System.out.println("移動");
    }

    /*  Weaponの抽象メソッドを実装

            攻撃メソッド
     */

    public void attack() {
        System.out.println(this.getName() + "の攻撃方法");

        System.out.println("--------------------");

        fire();

        move();

        System.out.println("--------------------");
    }

}
