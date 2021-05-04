package dev3;

/** Sample2の継承クラスを用いた管理方法の完成系
 *
 *      配列を生成し、それぞれの継承先のクラスを格納
 *
 *      ~使用するファイル~
 *
 *          ・Sample3.java
 *          ・Bird.java
 *          ・Crow2.java
 *          ・Sparrow2.java
 */

public class Sample3 {

    public static void main(String[] args) {

        // Birdクラスの変数の配列を生成
        Bird b[] = new Bird[2];

        // b[0]にCrow2クラスのインスタンスを生成
        b[0] = new Crow2();

        // b[1]にSparrow2クラスのインスタンスを生成
        b[1] = new Sparrow2();


        for (int i = 0; i < b.length; i++) {

            System.out.print(b[i].getName() + " : ");
            b[i].sing();
        }
    }
}
