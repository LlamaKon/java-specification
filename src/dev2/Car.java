package dev2;

public class Car {

    // 燃料
    private int  fuel = 0;
    // 移動距離
    private int migration = 0;

    public Car() {

        System.out.println("Carオブジェクト生成");
    }

    // 移動メソッド
    public void move() {

        // 燃料があるなら移動
        if (fuel >= 0) {

            // 距離移動
            migration++;
            // 燃料消費
            fuel--;
        }
        System.out.println("移動距離： " + migration);
        System.out.println("燃料： " + fuel);
    }

    // 燃料補給メソッド
    public void supply(int fuel) {

        if (fuel > 0) {

            // 燃料補給
            this.fuel = fuel;
        }
        System.out.println("燃料： " + fuel);
    }
}
