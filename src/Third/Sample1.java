package Third;

public class Sample1 {

    public static void main(String[] args) {

        // 標準出力
        int a = -2;

        System.out.println("a = " + a);

        /*
        入力した値が正の数かを調べる
        ()内の式がtrueであればif文内の処理を実行
        ()内の式がfalseであればif文内の処理を実行しない
         */

        if (a>0) {
            System.out.println("aは正の数です。");
        }
    }
}
