package dev4;

public class Sample1 {

    public static void main(String[] args) {

        // 携帯クラスのインスタンスを生成
        CellPhone cp = new CellPhone("hoge@email.com", "090-1234-5678");

        // 携帯クラスで電話とメールを送る
        cp.call("011-123-4567");
        cp.sendMail("fuga@email.com");

        // 電話インターフェースでインスタンスにアクセス
        IPhone phone = (IPhone) cp;
        // 電話をかける
        phone.call("011-987-6543");

        /*
        電話インターフェースではメールの送信メソッドは利用できない
         */
        // phone.sendMail("foo@email.com");

        // メールインターフェースでインスタンスにアクセス
        IEmail mail = (IEmail) cp;

        // メールを送る
        mail.sendMail("bar@email.com");

         /*
        メールインターフェースでは電話メソッドは利用できない
         */
        // mail.call("011-222-3333");



    }
}
