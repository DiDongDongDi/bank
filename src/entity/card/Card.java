// interface BankOperation
//{
//    public void return_money(int num);
//    public void use_money(int num);
//}
package entity.card;
public abstract class  Card  {
    private int CardNumber;
    private String code;
    public abstract void show();
    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public String getCode() {
        return code;
    }

}
