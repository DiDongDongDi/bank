package entity.card;
public class DebitCard extends Card{
    private int balance; //余额

    public static int D_count = 0; //储蓄卡账号
    public DebitCard(){

    }

    public int getBalance() {
        return balance;
    }

    public void Create_DebitCard()  //增加储蓄卡
    {
        D_count++;
        this.setCardNumber(D_count);
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
    public void show()
    {
        System.out.println("卡类型\t\t卡号\t\t存款");
        System.out.println("借记卡"+"\t\t"+this.getCardNumber()+"\t\t"+getBalance());
    }
}
