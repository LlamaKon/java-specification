package dev7;

// 例外クラスのサンプル
public class SampleException extends Exception{

    // シリアルバージョン番号
    private static final long serialVersionUID = 1L;

    /* コンストラクタ

        super()で引数の値をスーパークラス(Exception)に送信
     */
    public SampleException(String message) {
        super(message);
    }

    /* 例外クラスの作成

            Exceptionクラスを継承する。

     */
}
