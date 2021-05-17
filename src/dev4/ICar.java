package dev4;

public interface ICar {

    /*
        インターフェースのフィールドの値は定数
     */

    public String TYPE_NAME = "car";

    /*
        インターフェースのメソッドは抽象メソッド
     */

    // 移動メソッド
    public void move();
}
