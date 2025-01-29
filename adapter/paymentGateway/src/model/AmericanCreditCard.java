package model;

import enums.CreditCardEnum;

public class AmericanCreditCard {
    private String number;
    private String ownerName;
    private CreditCardEnum nacionality;

    public AmericanCreditCard(String number, String ownerName){
        this.number = number;
        this.ownerName = ownerName;
        this.nacionality = CreditCardEnum.American;
    }

    public String getNumber() {
        return number;
    }

    public String getOwnerName() {
        return ownerName;
    }
    
    public CreditCardEnum getNacionality() {
        return nacionality;
    }

}
