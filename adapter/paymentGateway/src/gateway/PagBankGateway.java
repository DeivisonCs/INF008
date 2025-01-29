package gateway;

import model.AmericanCreditCard;

public class PagBankGateway {

    public Boolean verifyPayment(AmericanCreditCard creditCard){
        System.out.println("PagBank Valid Payemnt\n" + "Card: " + creditCard.getOwnerName() + " " + creditCard.getNumber() + " " + creditCard.getNacionality());
        return true;
    }

    public void sendReceipt(){
        System.out.println("PagBank Receipt");
    }
}
