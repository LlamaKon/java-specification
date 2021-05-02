package seventh;

public class Sample2 {

    public static void main(String[] args) {

        // 引数有りコンストラクタの呼び出し
        SampleClass3 s = new SampleClass3("Hello World");

        // SampleClass3 s = new SampleClass3();

        // numberのセッターで値を設定
        s.setNumber(100);

        // ゲッターで値を呼び出し、出力
        System.out.println(s.getNumber());
        System.out.println(s.getStr());
    }
}
