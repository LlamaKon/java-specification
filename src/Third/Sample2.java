package Third;

public class Sample2 {

    public static void main(String[] args) {

        // 標準出力
        int a = 7;

        System.out.println("a = " + a);

        // 入力した値が正の数かを調べる

        if (a > 0) {
            System.out.println("aは正の数です。");
        }

        // if文で条件が成り立たない場合に実行される処理
        else {
            System.out.println("aは正の数ではありません。");
        }
    }
}
