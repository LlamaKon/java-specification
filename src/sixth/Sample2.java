package sixth;

public class Sample2 {

    public static void main(String[] args) {
        Sampleclass1 s1, s2, s3;

        s1 = new Sampleclass1();
        s2 = new Sampleclass1();
        s3 = new Sampleclass1();

        // インスタンスs1, s2ごとにフィールドに違う値を代入
        s1.n = 100;
        s2.n = 200;
        s3.n = 300;

        s1.s = "ABC";
        s2.s = "あいう";
        s3.s = "123";

        // インスタンスごとにメソッドの呼び出し
        System.out.println(s1.add("EDF"));
        System.out.println(s2.add("えお"));
        System.out.println(s3.add("456"));

        s1.showNum();
        s2.showNum();
        s3.showNum();
    }
}
