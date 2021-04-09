package fourth;

public class Sample5 {

    public static void main(String[] args) {

        int i, num;

        num = 1;

        /**
         * while文では先に条件を判定するため、
         * 中の処理には進まない場合がある。
         *
         * do~while文では後に条件を判定するため、
         * 必ず中の処理が一度は実行される。
         */

        // while文で実行
        System.out.print("while文で実行");
        i = 1;
        while (i < num) {
            System.out.println("*");
            i++;
        }
        System.out.println();

        // do~while文で実行
        System.out.print("do~while文で実行");
        i = 1;
        do {
            System.out.print("*");
            i++;
        }
        while (i < num);
    }
}
