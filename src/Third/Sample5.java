package Third;

public class Sample5 {

    public static void main(String[] args) {

        // 整数値
        int num = 2;

        /** switch文
         *  １つの処理の後にbreakを入れないと、
         *  そのまま下のcaseの処理に進んでしまう。
         */
        switch(num) {


            case 1:
                System.out.println("one");
                break;

            // numが2の場合
            case 2:
                System.out.println("two");
                break;

            // numが3の場合
            case 3:
                System.out.println("three");
                break;

            // それ以外の値が入力された時の処理
            default:
                System.out.println("不適切な値です");

        }
    }
}
