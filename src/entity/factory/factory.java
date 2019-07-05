
package entity.factory;
import entity.card.*;
public class factory {
    public Card addCard(int num) {
        System.out.println("欢迎办卡！");
        switch (num) {
            case 1:
                DebitCard card = new DebitCard();
                card.Create_DebitCard();
                return card;

            case 2:
                CreditCard card2 = new CreditCard();
                card2.Create_Credit();
                return card2;

            default:
                System.out.println("不存在这种卡");
                return null;

        }
    }
}
