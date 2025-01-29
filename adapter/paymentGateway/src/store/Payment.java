package store;

import model.AmericanCreditCard;

public interface Payment {
    public void validPayment(AmericanCreditCard creditCard);
    public void generateReceipt();
}
