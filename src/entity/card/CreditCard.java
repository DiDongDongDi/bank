package entity.card;
import java.util.Scanner;
public class CreditCard extends Card {
    private int limitation;//透支额度
    private int despoit;//存入的现金
    public int balance;//卡上余额
    public int getLimitation() {
        return limitation;
    }

    public int getDespoit() {
        return despoit;
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
        despoit=0;
        balance=limitation+despoit;
    }
    public void Create_Credit()
    {
        count++;
        setCardNumber(count);
        System.out.println("您的信用卡办理成功, 卡号为: "+this.getCardNumber());
    }
    public void use_money(int money)
    {
        if(money>(balance))
            System.out.println("额度不足无法支付!");
        else {
            setBalance(getBalance()-money);
            System.out.println("支付成功! 剩余额度为: "+balance);
        }
    }
    public void return_money(int money)
    {
        /*if(money>getBalance())
        {
            System.out.println("你没有欠那么多钱，退还"+(money-getBalance()));
            setBalance(0);
        }
        else
        {
            setBalance(getBalance()-money);
            System.out.println("还款成功！还欠款"+getBalance());

        }*/
        despoit +=money;
        balance = despoit + limitation;
        System.out.println("存入成功, 卡上额度为: "+balance);
    }

    @Override
    public void start() {
        while(true){
            System.out.println("请输入你想进行的操作:");
            System.out.println("1. 存款");
            System.out.println("2. 取款");
            System.out.println("0. 退出");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            switch(op){
                case 1://存款操作
                    try {
                        System.out.println("请输入你想存入的金额:");
                        int num = sc.nextInt();
                        if(num>=0)
                        {
                            return_money(num);
                            System.out.println("存入 "+num+" 成功!");
                        }
                        else
                            throw new Exception("只能存入正整数类型!");
                    }catch (Exception e)
                    {
                        System.out.println("只能存入正整数类型!");
                    }

                    break;
                case 2://取款操作
                    try {
                        System.out.println("请输入你想取出的金额:");
                        int num2 = sc.nextInt();
                        if(num2>=0) {
                            use_money(num2);
                            System.out.println("取出 "+num2+" 成功");
                        }
                        else
                            throw new Exception("只能输入正整数类型!");
                    }catch (Exception e)
                    {
                        System.out.println("只能输入正整数类型!");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("输入有误, 请重新输入!");
            }
        }
    }
    public void show()
    {
        System.out.println("卡类型\t\t卡号\t\t信用额度\t\t可消费数额");
        System.out.println("信用卡"+"\t\t"+this.getCardNumber()+"\t\t"+getLimitation()+"\t\t"+getBalance());
    }
}
