package entity;
import java.util.Scanner;
public class CreditCard extends  Card{
            private int limitation;
            public static int C_count=0;
            public int balance;
    public double getLimitation() {
        return limitation;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    CreditCard()
    {
        limitation=2000;
        balance=0;
    }
    public void Create_Credit()
    {
        C_count++;
        setCardNumber(C_count);
        System.out.println("您的信用卡卡号为"+C_count);
    }
    public void use_money(int money)
    {
        if(money>(getLimitation()-balance))
            System.out.println("额度不足无法支付");
        else {
            setBalance(getBalance()+money);
            System.out.println("支付成功！剩余额度为"+(getLimitation()-getBalance()));
        }
    }
    public void return_money(int money)
    {
        if(money>getBalance())
        {
            System.out.println("你没有欠那么多钱，退还"+(money-getBalance()));
        }
        else
        {
            setBalance(getBalance()-money);
            System.out.println("还款成功！还欠款"+getBalance());

        }
    }
}
