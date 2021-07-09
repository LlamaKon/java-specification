package dev5;

import java.util.ArrayList;

public class Sample3 {

    public static void main(String[] args) {

        // String型でデータを追加
        ArrayList<String> s1 = new ArrayList<String>();

        s1.add("ONE");
        s1.add("TWO");
        s1.add("THREE");

        // 拡張for文
        for (String s : s1) {
            System.out.print(s + " ");
        }

        // 改行
        System.out.println();

        /*
        Integer型でデータを追加

            int型からInteger型に内部的に自動変換　
         */

        ArrayList<Integer> i1 = new ArrayList<Integer>();

        i1.add(1);
        i1.add(2);
        i1.add(3);

        // 拡張for文
        for (Integer i : i1) {
            System.out.print(i + " ");
        }
    }
}
