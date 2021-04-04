package second;

public class Sample4 {

    public static void main(String[] args) {

        int a;

        double b, c, d;

        /*
        キャスト → 変数 = (キャスト) 宣言;
         */

        // キャストで代入
        a = (int) 1.23;

        b = 1.23;

        // キャストなしの代入
        c = 10;

        // キャストありで代入
        d = (double) c;

        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }
}
