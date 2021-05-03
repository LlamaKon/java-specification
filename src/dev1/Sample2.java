package dev1;

public class Sample2 {

    public Sample2() {
        System.out.println("コンストラクタ");
    }

    public void foo() {
        System.out.println("インスタンスメソッド");
    }

    public static void bar() {
        System.out.println("静的メソッド");
    }

    public static void main(String[] args) {

        /**
         * 自身のクラスの中で自身のインスタンスを作成できる
         */
        Sample2 i = new Sample2();

        i.foo();


        // 様々な静的メソッドの呼び出し

        // インスタンスからも静的メソッドを呼べる
        i.bar();

        // クラス名からの呼び出し
        Sample2.bar();

        // 同じクラス内ならクラス名無しでも呼び出せる
        bar();

        // ガーベージコレクタの呼び出し
        System.gc();
    }
}
