package second;

public class Sample3 {

    public static void main(String[] args) {

        // 使用する変数の定義

        // 定義１
        int a1=2, b1=2, c1=2, d1=2;

        // 定義２
        int a2=2, b2=2, c2=2, d2=2;

        // 普通演算による計算と代入
        a1 = a1 + 1;
        b1 = b1 - 1;
        c1 = c1 * 2;
        d1 = d1 / 2;

        // 代入演算による計算
        a2 += 1;
        b2 -= 1;
        c2 *= 2;
        d2 /= 2;

        // 出力
        System.out.println("a1=" + a1 + " b1=" + b1 + " c1=" + c1 + " d1=" + d1);
        System.out.println("a2=" + a2 + " b2=" + b2 + " c2=" + c2 + " d2=" + d2);
    }
}
