package model;

public class Address {
    private String cep;
    private String number;

    public Address(String cep, String number){
        this.cep = cep;
        this.number = number;
    }

    public Address(Address addresss){
        this.cep = addresss.getCep();
        this.number = addresss.getNumber();
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNumber() {
        return number;
    }
}
