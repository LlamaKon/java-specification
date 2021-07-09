package dev5;

import java.util.ArrayList;

public class Sample1 {

    public static void main(String[] args) {

        /* ArrayList

                要素を格納するための配列の長さを変更可能
         */
        ArrayList a1 = new ArrayList();

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
        for (int i = 0; i < a1.size(); i++) {
            Student s = (Student) a1.get(i);
            System.out.println("番号" + s.getNumber() + "名前：" + s.getName() + "学年：" + s.getGrade());
        }
    }
}
