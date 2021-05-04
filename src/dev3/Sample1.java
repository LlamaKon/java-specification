package dev3;

public class Sample1 {

    public static void main(String[] args) {

        /** 抽象クラス
         *
         *      カラスクラスと雀クラスの処理は似ている。
         *
         *      管理の方法としては非常に勿体ない。
         */

        // カラスクラス
        Crow1 c = new Crow1();

        // 雀クラス
        Sparrow1 s = new Sparrow1();

        // カラスが鳴く
        System.out.print(c.getName() + " : ");
        c.sing();

        // 雀が鳴く
        System.out.print(s.getName() + " : ");
        s.sing();
    }
}
