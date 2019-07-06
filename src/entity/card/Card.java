
package entity.card;

import java.util.Scanner;

import java.io.*;

public abstract class Card implements Serializable{
    private int CardNumber;
    public static int count = 0;
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
