package dev3;

public class Sample2 {

    public static void main(String[] args) {

        Crow2 c = new Crow2();

        Sparrow2 s = new Sparrow2();

        // カラスが鳴く
        System.out.print(c.getName() + " : ");
        c.sing();

        // 雀クラス
        System.out.print(s.getName() + " : ");
        s.sing();
    }
}
