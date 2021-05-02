package seventh;

public class SampleClass3 {

    /**
     * Javaにおいて原則として、フィールドはprivateでカプセル化する
     * (カプセル化によって外部からアクセス出来ないようにする）
     *
     * 別でフィールドの値を取得できる仕組みを作成する必要がある
     *
     *     ・SampleClass3（コンストラクタ)
     *     ・setNumber
     *     ・getNumber
     *     ・getStr
     */

    // int型のフィールド(privateで隠蔽）
    private int number = 0;

    // String型のフィールド(privateで隠蔽）
    private String str = "";

    // コンストラクタ（引数有り）
    public SampleClass3(String str) {

        // 引数をstrフィールドへ代入
        this.str = str;
    }

    // number変数のセッター
    public void setNumber(int number) {

        // 引数をnumberフィールドへ代入
        this.number = number;
    }

    // number変数のゲッター
    public int getNumber() {
        return this.number;
    }

    // str変数のゲッター
    public String getStr() {
        return this.str;
    }
}
