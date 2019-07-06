package entity.factory;

import entity.card.Card;
import entity.card.DebitCard;

public class Product_debit implements Product {
    public Card produce()
    {
        DebitCard card=new DebitCard();
        card.Create_DebitCard();
        return card;
    }
}
