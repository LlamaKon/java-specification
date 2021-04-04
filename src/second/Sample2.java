package second;

public class Sample2 {

    public static void main(String[] args) {

        /*
        int → 整数値を宣言
        double → 実数を宣言（小数など）
         */

        // 変数の宣言
        int a;

        // 初期化と代入を同時に行う
        int b = 5;

        // 複数の変数を同時に宣言
        int add, sub;

        // int以外の変数を宣言
        double avg;

        // 代入（初期化）
        a = 8;

        // aとbの和を求める
        add = a + b;

        // aとbの差を求める
        sub = a - b;

        // aとbの平均値を求める
        avg = (a + b) / 2.0;

        //出力
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " と " + b + " の平均値： " + avg);
    }
}
