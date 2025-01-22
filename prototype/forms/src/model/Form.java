package model;

public abstract class Form {
    private String fullName;
    private String email;

    public Form(String fullName, String email){
        this.email = email;
        this.fullName = fullName;
    }

    public abstract Form getClone();

    public String getFullName() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }
}
