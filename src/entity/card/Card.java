
package entity.card;

import java.util.Scanner;

public abstract class Card  {
    private static int CardNumber=0;
    private String code;

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
    public abstract void start();
    public abstract void show();
}
