package dev1;

public class Sample1 {

    public static void main(String[] args) {
        SampleClass1 s1, s2, s3, s4;

        /** インスタンスの数を表示
         *
         *      静的メンバである場合、インスタンスを作成しなくても、
         *      実行することが可能。
         *
         *      (static)
         */

        System.out.println("インスタンス数；" + SampleClass1.getNumberOfInstance());

        // インスタンスを生成
        // コンストラクタ①を呼び出す
        s1 = new SampleClass1(50);

        // コンストラクタ②を呼び出す
        s2 = new SampleClass1();

        // 値を取得して表示
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

        // インスタンスの数を表示
        System.out.println("インスタンス数；" + SampleClass1.getNumberOfInstance());

        // インスタンスを生成②
        s3 = new SampleClass1(200);
        s4 = new SampleClass1();

        // インスタンスの数を表示
        System.out.println("インスタンス数；" + SampleClass1.getNumberOfInstance());

        // 値を取得して表示②
        System.out.println(s3.getValue());
        System.out.println(s4.getValue());
    }
}
