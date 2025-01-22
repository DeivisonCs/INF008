package model;

public class SignUpForm extends Form{
    private String passsword;
    private Address address;

    public SignUpForm(String fullName, String email, String passsword, Address address){
        super(fullName, email);
        this.passsword = passsword;
        this.address = address;
    }

    public SignUpForm(SignUpForm form){
        super(form.getFullName(), form.getEmail());
        this.passsword = form.getPasssword();
        this.address = new Address(form.getAddress());
    }

    @Override
    public Form getClone() {
        return new SignUpForm(this);
    }

    public String getPasssword() {
        return passsword;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "SignUpForm" +
                "\n\tName: " + getFullName() + 
                "\n\tEmail: " + getEmail() + 
                "\n\tPassword: " + getPasssword() + 
                "\n\tAddress: " + address.getCep() + " | " + address.getNumber();
    }

}
