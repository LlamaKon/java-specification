package dev3;

// 抽象クラス（鳥）

/**
 *  abstract → 抽象
 *
 *      コンストラクタを生成した際、
 *      Birdクラスの引数付きコンストラクタの処理が行われる
 *
 *      抽象クラスはインスタンスを生成することが出来ない
 */
public abstract class Bird {

    // 名前フィールド
    private String name;

    // 引数付きコンストラクタ
    Bird(String name) {

        this.name = name;
    }

    // 名前の取得
    public String getName() {

        return name;
    }

    // 鳴く（抽象メソッド）

    /** 抽象メソッド
     *
     *      継承先でクラスの処理を定義していく
     *
     *          ・Crow2.java
     *          ・Sparrow2.java
     */
    abstract void sing();
}
