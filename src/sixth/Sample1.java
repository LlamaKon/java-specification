package sixth;

public class Sample1 {

    /**
     * オブジェクト指向
     *
     * オブジェクトは以下の要素を持つ
     * 　・メソッド　　→　オブジェクトの動作
     * 　・フィールド　→　オブジェクトの属性・データ
     *
     * インスタンスとも呼ぶ
     */

    public static void main(String[] args) {

        // インスタンスの生成
        Sampleclass1 s = new Sampleclass1();

        // フィールドnに値を代入
        s.n = 100;

        // フィールドsに値を代入
        s.s = "Hello";

        // メソッドaddを呼び出し
        int ans = s.add(1,2);

        // メソッドaddを呼び出し
        String str = s.add("World");

        //呼び出し結果の表示
        System.out.println(ans);
        System.out.println(str);

        // メソッドshowNumを呼び出し
        s.showNum();
    }
}
