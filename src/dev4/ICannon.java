package dev4;


public interface ICannon {

    /*
        インターフェースのフィールドの値は定数
     */

    public String WEAPON_NAME = "cannon";

    /*
        インターフェースのメソッドは抽象メソッド
     */

    // 大砲を撃つ
    public abstract void fire();
}
