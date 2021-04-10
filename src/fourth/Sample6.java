package fourth;

public class Sample6 {

    public static void main(String[] args) {

        System.out.println("6が出たら終了");

        // 無限ループ
        while (true) {

            /**
             * 1~6までの乱数を生成し、diceに代入
             */
            int dice = (int)(Math.random()*6) + 1;
            System.out.println(dice);

            // 6であればループから抜ける
            if (dice == 6) {

                // ループから抜ける
                break;
            }
        }
        System.out.println("終了");
    }
}
