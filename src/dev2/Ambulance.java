package dev2;


/**
 *  Anbulanceコンストラクタを呼び出すと、
 *  先に親クラスであるCarクラスのCarインスタンスが呼び出される。
 */
public class Ambulance extends Car {

    // 番号
    private int number = 119;

    // コンストラクタ
    public Ambulance() {
        System.out.println("Ambulanceオブジェクト生成");
    }

    // 救急救命活動
    public void savePeople() {
        System.out.println("救急救命活動");
        System.out.println("呼び出しは" + number + "番");
    }
}
