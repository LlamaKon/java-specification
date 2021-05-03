package dev2;

public class Sample2 {

    /**
     * Javaではすべてのクラスはオブジェクトクラスを継承している
     *
     *      明記しなくても使用することが出来る
     *      （暗黙的に継承しているオブジェクトクラスのメソッド）
     */

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.toString());
        System.out.println(c.getClass());

        Object o = (Object) c;
        System.out.println(o.toString());
        System.out.println(o.getClass());
    }
}
