package dev7;

public class Sample3 {

    public static void main(String[] args) {

        /* try-catch文

                複数のcatch文を記述することができる。
         */
        try {
            for (int i = 0; i <= 5; i++) {
                int a = getNum(i);
                int b = 5;

                System.out.print(a + "/" + b + "=");
                System.out.println(calc(a, b));
            }
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("0による割り算発生");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外にアクセスしました");
        } finally {
            System.out.println("終了");
        }
    }

    /* throws

            例外を投げる際に記述
            s
     */

    // 割り算用メソッド
    private static int calc(int a, int b) throws ArithmeticException {
        return a / b;
    }

    // 範囲外に出た際の処理
    public static int getNum(int index) throws ArrayIndexOutOfBoundsException {
        int[] num = {1, 2, 3, 4};
        return num[index];
    }
}
