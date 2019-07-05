package entity.card;
import java.util.Scanner;
public class CreditCard extends Card {
    private int limitation;
    public int balance;//已用额度
    public double getLimitation() {
        return limitation;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public CreditCard()
    {
        limitation=2000;
        balance=0;
    }
    public void Create_Credit()
    {
        CardNumber++;
        System.out.println("您的信用卡卡号为"+cardNumber);
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
            setBalance(0);
        }
        else
        {
            setBalance(getBalance()-money);
            System.out.println("还款成功！还欠款"+getBalance());

        }
    }

    @Override
    public void start() {
        while(true){
            System.out.println("请输入你想进行的操作");
            System.out.println("1. 存款");
            System.out.println("2.取款");
            System.out.println("0. 退出");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch(op){
                case 1://还款操作
                    System.out.println("请输入你想还的金额：");
                    int num = sc.nextInt();
                    return_money(num);
                    break;
                case 2://取款操作
                    System.out.println("请输入你想使用的金额：");
                    int num2 = sc.nextInt();
                    use_money(num2);
                case 0:
                    System.out.println("成功退出系统!");
                   return;
                default:
                    System.out.println("输入有误, 请
                                       重新输入!");
            }
        }
    }
    public void show()
    {
        System.out.println("卡类型\t\t卡号\t\t总额度\t\t已透支");
        System.out.println("信用卡"+"\t\t"+this.getCardNumber()+"\t\t"+getLimitation()+"\t\t"+getBalance());
    }
}
