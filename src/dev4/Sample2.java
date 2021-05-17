package dev4;

public class Sample2 {

    public static void main(String[] args) {

        Tank t = new Tank();

        System.out.println(t.getName() + "の武器の名前：" + Tank.WEAPON_NAME);
        System.out.println(t.getName() + "武器のタイプ：" + Tank.TYPE_NAME);
        System.out.println();

        // 攻撃
        t.attack();
    }
}
