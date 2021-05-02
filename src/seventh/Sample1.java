package seventh;

public class Sample1 {

    public static void main(String[] args) {

        /**
         * SampleClass2.javaからコンストラクタやメソッドを呼び出す
         *
         *     ・method1 (private)
         *     ・method2 (public)
         *     ・method3 (public)
         *     ・num     (private)
         *
         */

        /**
         *  インスタンスを生成した時点で
         *  コンストラクタは1度だけ実行される。
         */

        SampleClass2 s = new SampleClass2();

        // method1()はprivateのため、外部からアクセスは出来ない
        // s.method1();

        // method1呼び出し
        s.method2();

        /**
         * publicのメソッドでprivateメソッドを呼び出した場合、
         * 結果の通り、privateメソッドを呼び出せている
         */
        // method3呼び出し
        s.method3();

        // numはprivateフィールドのため、外部からアクセス出来ない
        // s.num = 1;

    }
}
