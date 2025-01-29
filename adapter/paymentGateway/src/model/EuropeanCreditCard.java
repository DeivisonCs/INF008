package model;

import enums.CreditCardEnum;

public class EuropeanCreditCard {
    private String number;
    private CreditCardEnum nacionality;

    public EuropeanCreditCard(String number){
        this.number = number;
        this.nacionality = CreditCardEnum.European;
    }

    public String getNumber() {
        return number;
    }
    
    public CreditCardEnum getNacionality() {
        return nacionality;
    }
}
