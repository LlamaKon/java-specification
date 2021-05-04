package dev3;

/** 雀クラス
 *
 *      親クラス（Birdクラス)の抽象クラス
 *
 *      extends [ class name ]で継承先のクラスを指定
 *
 */
public class Sparrow2 extends Bird {

    //コンストラクタ（引数無し）
    public Sparrow2() {

        // Birdクラスの引数付きコンストラクタを呼び出す
        super("雀");
    }

    // 雀が鳴く
    public void sing() {
        System.out.println("チュンチュン");
    }
}
