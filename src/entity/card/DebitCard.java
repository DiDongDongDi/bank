package entity.card;

import java.util.Scanner;

public class DebitCard extends Card {
    private int balance; //余额

    public static int D_count = 0; //储蓄卡账号
    public DebitCard(){

    }

    public int getBalance() {
        return balance;
    }

    public void Create_DebitCard()  //增加储蓄卡
    {
        CardNumber++;
        System.out.println("储蓄卡办理成功，卡号为："+this.getCardNumber());
    }
    public int save_money(int num) //存钱
    {
        this.balance += num;
        return this.balance;
    }
    public int draw_money(int num)//取钱
    {
        if(this.balance<num)
        {
            System.out.println("取钱失败，余额不足！");
            return balance;
        }
        else
        {
            System.out.println("取钱成功！卡上余额为："+(this.balance-num));
            this.balance -= num;
            return this.balance;
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
                case 1://存款操作
                    System.out.println("请输入你想存入的金额：");
                    int num = sc.nextInt();
                    save_money(num);
                    break;
                case 2://取款操作
                    System.out.println("请输入你想取出的金额：");
                    int num2 = sc.nextInt();
                    draw_money(num2);
                case 0:
                    System.out.println("成功退出系统!");
                    return;
                default:
                    System.out.println("输入有误, 请重新输入!");
            }
        }
    }
    public void show()
    {
        System.out.println("卡类型\t\t卡号\t\t卡上余额");
        System.out.println("储蓄卡"+"\t\t"+this.getCardNumber()+"\t\t"+getBalance());
    }
}
