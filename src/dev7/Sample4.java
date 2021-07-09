package dev7;

public class Sample4 {

    public static void main(String[] args) {

        try {

            // 故意に例外を投げる
            throw new SampleException("自作の例外");
        } catch (SampleException e) {
            e.printStackTrace();
        }
    }
}
