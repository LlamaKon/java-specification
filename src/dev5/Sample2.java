package dev5;

import java.util.ArrayList;

public class Sample2 {

    public static void main(String[] args) {

        /* ArrayList（ジェネリクス使用）

            ジェネリクス  -> <>の中に型を指定
                           <>で指定した型のみデータを追加できる。

            要素を格納するための配列の長さを変更可能
        */
        ArrayList<Student> a1 = new ArrayList<Student>();

        // addで要素を追加
        a1.add(new Student("安藤", 1, 1));
        a1.add(new Student("近藤", 1, 2));
        a1.add(new Student("遠藤", 2, 3));
        a1.add(new Student("坂東", 2, 4));
        a1.add(new Student("進藤", 3, 5));

        // 3番目削除
        a1.remove(3);

        /*
            size()  -> ArrayListの長さを取得
            get()   -> ArrayListの要素を取得
        */

        /*
            拡張for文
                for ( 型 変数名 : 配列名) {
                }
         */
        for (Student s : a1) {
            System.out.println("番号" + s.getNumber() + "名前：" + s.getName() + "学年：" + s.getGrade());
        }
    }

}
