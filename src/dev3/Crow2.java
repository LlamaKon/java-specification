package dev3;

/** カラスクラス
 *
 *      親クラス（Birdクラス)の抽象クラス
 */
public class Crow2 extends Bird {

    // コンストラクタ（引数無し）
    public Crow2() {

        // Birdクラスの引数付きコンストラクタを呼び出す
        super("カラス");
    }

    // カラスが鳴く
    public void sing() {
        System.out.println("カーカー");
    }
}
