package fourth;

public class Sample4 {

    public static void main(String[] args) {

        int i = 0;

        /**
         * do~while文
         * 条件判定が後ろにある
         * whileの条件を満たす満たさない関係なく、
         * doの中の処理が実行される
         */

        do {
            System.out.print(i + " ");
            i++;
        }
        while(i <= 5);
        System.out.println();

    }
}
