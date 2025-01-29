import adapter.PagBankAdapter;
import adapter.PagSeguroAdapter;
import adapter.PayPalAdapter;
import model.AmericanCreditCard;

public class App {
    public static void main(String[] args) throws Exception {
        PagBankAdapter pagBankGateway = new PagBankAdapter();
        AmericanCreditCard myAmericanCard = new AmericanCreditCard("111", "Martina");
        
        pagBankGateway.validPayment(myAmericanCard);


        PagSeguroAdapter pagSeguroGateway = new PagSeguroAdapter();
        pagSeguroGateway.validPayment(myAmericanCard);

        PayPalAdapter PayPalGateway = new PayPalAdapter();
        PayPalGateway.validPayment(myAmericanCard);
    }
}
