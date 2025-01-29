package gateway;

import model.EuropeanCreditCard;

public class PayPalGateway {

    public Boolean validPayment(EuropeanCreditCard creditCard){
        System.out.println("PayPal Valid Payemnt\n" + "Card: " + creditCard.getNumber() + " " + creditCard.getNacionality());
        return true;
    }

    public void generateReceipt(){
        System.out.println("PayPal Receipt");
    }
}
