package entity.factory;

import entity.card.Card;
import entity.card.CreditCard;

public class Product_credit implements Product{
    public Card produce()
    {
        CreditCard card=new CreditCard();
        card.Create_Credit();
        return card;
    }
}
