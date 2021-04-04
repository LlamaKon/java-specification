package second;

public class Sample6 {

    public static void main(String[] args) {

        /*
        final付きの変数を宣言した場合、後で値を変えることは不可能
        定数を宣言する場合、全て大文字で宣言する
         */
        final int NUMBER = 100;

        final String STRING = "Hoge";

        // 出力
        System.out.println(NUMBER);
        System.out.println(STRING);

        // エラーが生じる
//        NUMBER = 100;
//        STRING = "change";
    }
}
