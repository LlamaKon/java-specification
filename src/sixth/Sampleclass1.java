package sixth;

public class Sampleclass1 {

    /**
     * オブジェクト指向
     *
     * オブジェクトは以下の要素を持つ
     * 　・メソッド　　→　オブジェクトの動作
     * 　・フィールド　→　オブジェクトの属性・データ
     *
     * インスタンスとも呼ぶ
     */

    // フィールド
    int n = 10;
    String s = "field";

    // メソッド
    int add(int a, int b) {
        return a + b;
    }

    String add(String s) {
        return this.s + s;
    }
    void showNum() {
        System.out.println("n = " + n);
    }
}
