package dev1;

// 静的メンバを持つクラス
public class SampleClass1 {

    // インスタンスフィールド
    private int value = 0;

    /** 静的メンバ
     *      staticと付けることで静的メンバを生成
     */

    // 静的フィールド
    private static int num = 0;

    /** コンストラクタのオーバーロード
     *
     *      引数の型の違いや、引数の有無によって
     *      同名のコンストラクタを作成することが可能
     *
     */

    // コンストラクタ①（引数有り）
    public SampleClass1(int value) {

        // 引数をインスタンスフィールドに代入
        this.value = value;

        // 静的メンバのインクリメント
        num++;
    }

    // コンストラクタ②（引数無し）
    public SampleClass1() {

        /** 引数有りコンストラクタを呼び出す
         *
         *      thisを使用することで、
         *      引数のあるコンストラクタを呼び出している。
         *      この場合はコンストラクタ①を呼び出している
         */

        this(100);
    }

    // インスタンスの数を取得
    public static int getNumberOfInstance() {
        return num;
    }

    // インスタンスフィールドを取得
    public int getValue() {
        return this.value;
    }

}
