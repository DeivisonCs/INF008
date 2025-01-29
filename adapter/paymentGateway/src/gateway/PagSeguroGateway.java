package gateway;

import model.EuropeanCreditCard;

public class PagSeguroGateway {
    public Boolean checkPayment(EuropeanCreditCard creditCard){
        System.out.println("PagSeguro Valid Payemnt\n" + "Card: " + creditCard.getNumber() + " " + creditCard.getNacionality());
        return true;
    }

    public void getReceipt(){
        System.out.println("PagSeguro Receipt");
    }
}
