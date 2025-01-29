package adapter;

import gateway.PagSeguroGateway;
import model.AmericanCreditCard;
import model.EuropeanCreditCard;
import store.Payment;

public class PagSeguroAdapter implements Payment{
    private final PagSeguroGateway pagSeguroGateway;

    public PagSeguroAdapter(){
        this.pagSeguroGateway = new PagSeguroGateway();
    }

    @Override
    public void validPayment(AmericanCreditCard creditCard) {
        EuropeanCreditCard convertedCard = this.americanToEuropean(creditCard);
        this.pagSeguroGateway.checkPayment(convertedCard);
    }

    @Override
    public void generateReceipt() {
        this.pagSeguroGateway.getReceipt();
    }

    private EuropeanCreditCard americanToEuropean(AmericanCreditCard creditCard){
        return new EuropeanCreditCard(creditCard.getNumber() + "-1");
    }
}
