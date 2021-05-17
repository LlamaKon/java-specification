package dev4;

/* CellPhoneクラス

        IPhoneインターフェースとIEmailインターフェースを実装するためのクラス

 */
public class CellPhone implements IPhone, IEmail {

    /* フィールド

            ・メールアドレス
            ・電話番号
     */

    private String mailAddress;

    private String number;

    // コンストラクタ
    public CellPhone(String mailAddress, String number) {

        this.mailAddress = mailAddress;
        this.number = number;
    }

    // メールメソッド
    public void sendMail(String address) {
        System.out.println(address + "に、" + this.mailAddress + "からメールを送ります。");
    }

    // 電話メソッド
    public void call(String number) {
        System.out.println(number + "に、" + this.number + "から電話をかけます。");
    }

}
