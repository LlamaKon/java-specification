package dev2;

/** 継承
 *
 *      ・Car.java  → 親クラス、スーパークラス
 *      ・Ambulance → 子クラス、サブクラス
 *
 */
public class Sample1 {

    public static void main(String[] args) {

        Car c = new Car();

        // 燃料補給
        c.supply(10);

        // 移動
        c.move();
        c.move();

        Ambulance a = new Ambulance();

        a.supply(10);

        a.move();

        a.savePeople();
    }
}
