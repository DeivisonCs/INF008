package adapter;

import gateway.PagBankGateway;
import model.AmericanCreditCard;
import store.Payment;

public class PagBankAdapter implements Payment{
    private final PagBankGateway pagBankGateway;

    public PagBankAdapter(){
        this.pagBankGateway = new PagBankGateway();
    }

    @Override
    public void validPayment(AmericanCreditCard creditCard) {
        this.pagBankGateway.verifyPayment(creditCard);
    }

    @Override
    public void generateReceipt() {
        this.pagBankGateway.sendReceipt();
    }

}
