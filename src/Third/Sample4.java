package Third;

public class Sample4 {

    public static void main(String[] args) {

        // 1から7までの乱数を発生させる
        int dice = (int)(Math.random()*7)+1;

        // サイコロの目を入力
        System.out.println("サイコロの目： " + dice);

        // 値がサイコロの範囲内かを調べる
        if (1 <= dice && dice <= 6) {

            // サイコロの目が偶数か奇数かで処理を分ける
            // 偶数なら...
            if (dice == 2 || dice == 4 || dice == 6) {
                System.out.println("丁です。");
            }
            else {
                System.out.println("半です。");
            }
        }
        // 万が一7が出た時の処理
        else {
            System.out.println("範囲外の数値です。");
        }
    }
}
