package fifth;

public class Sample4 {

    public static void main(String[] args) {

        int a[][] = {{0,1},{2},{3,4,5,6}};

        // 成分表示
        /**
         * for文の中でintの変数(m, n)を宣言している
         */

        // 縦の部分を生成
        for (int m = 0; m < a.length; m++) {
            // 横の部分を生成
            for (int n = 0; n < a[m].length; n++) {
                System.out.print(a[m][n] + " ");
            }
            System.out.println();
        }
    }
}
