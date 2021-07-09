package dev6;

public class Sample3 {

    public static void main(String[] args) {

        String s1 = "ABCDEF";
        String s2 = "ABCDEF";
        String s3 = new String("ABCDEF");

        /* 文字列の比較

                文字列の比較をする際は、equals()メソッドを使用

                ==で比較をすると、オブジェクトの比較をする。
         */

        if (s1.equals(s2)) {
            System.out.println("s1とs2の文字列は等しい");
        } else {
            System.out.println("s1とs2の文字列は等しくない");
        }

        if (s1.equals(s3)) {
            System.out.println("s1とs3の文字列は等しい");
        } else {
            System.out.println("s1とs3の文字列は等しくない");
        }

        if (s1 == s2) {
            System.out.println("s1とs2のオブジェクトは等しい");
        } else {
            System.out.println("s1とs2のオブジェクトは等しくない");
        }

        if (s1 == s3) {
            System.out.println("s1とs3のオブジェクトは等しい");
        } else {
            System.out.println("s1とs3のオブジェクトは等しくない");
        }
    }
}
