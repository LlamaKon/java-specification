package dev6;

import java.util.HashSet;

public class Sample2 {

    public static void main(String[] args) {

        /* HashSet

             データを重複することなく追加することができる。

             重複しているデータを追加しようとした際は、
             自動で判定し、追加をしない。
         */

        HashSet<String> hs = new HashSet<String>();

        // add()でデータを追加
        hs.add("山田太郎");
        hs.add("飯田美代子");
        hs.add("齊藤吾郎");
        hs.add("山田太郎");
        hs.add("齊藤吾郎");


        for (String s : hs) {
            System.out.println(s);
        }

    }
}
