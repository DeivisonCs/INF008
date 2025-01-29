package adapter;

import gateway.PayPalGateway;
import model.AmericanCreditCard;
import model.EuropeanCreditCard;
import store.Payment;

public class PayPalAdapter implements Payment{
    private final PayPalGateway payPalAGateway;

    public PayPalAdapter(){
        this.payPalAGateway = new PayPalGateway();
    }

    @Override
    public void validPayment(AmericanCreditCard creditCard) {
        EuropeanCreditCard convertedCard = this.americanToEuropean(creditCard);
        this.payPalAGateway.validPayment(convertedCard);
    }

    @Override
    public void generateReceipt() {
        this.payPalAGateway.generateReceipt();
    }

    private EuropeanCreditCard americanToEuropean(AmericanCreditCard creditCard){
        return new EuropeanCreditCard(creditCard.getNumber() + "-1");
    }
}
