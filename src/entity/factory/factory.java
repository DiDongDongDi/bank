package entity.factory;
import entity.card.*;
public class factory {
    public Card addCard(int num) {
        Product product=null;
        System.out.println("欢迎办卡！");
        switch (num) {
            case 1:
                product=new Product_credit();
                return product.produce();

            case 2:
               product=new Product_debit();
               return product.produce();

            default:
                System.out.println("不存在这种卡");
                return null;

        }
    }
}
