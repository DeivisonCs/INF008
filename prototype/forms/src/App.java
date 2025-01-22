import model.Address;
import model.FeedBackForm;
import model.Form;
import model.SignUpForm;
import registry.FormRegistry;

public class App {

    public void withoutRegistry(){
        Form signUpForm1 = new SignUpForm("Teste dos Santos", "teste@gmail.com", "voejmvne", new Address("1123", "01"));
        Form signUpForm2 = signUpForm1.getClone();

        System.out.println(signUpForm1);
        System.out.println(signUpForm2);
        
        signUpForm2.setFullName("Divorciei Mudei de Nome da Silva");
        ((SignUpForm) signUpForm2).getAddress().setCep("0000");

        System.out.println(signUpForm1);
        System.out.println(signUpForm2);
    }

    public void withRegistry(){
        FormRegistry formRegistry = new FormRegistry();

        Form signUpForm = formRegistry.getForm("SignUpForm");
        Form feedBackForm = formRegistry.getForm("FeedBackForm");

        System.out.println(signUpForm);
        System.out.println(feedBackForm);
        
        ((FeedBackForm) feedBackForm).setScore((float) 10.0);

        System.out.println(formRegistry.getForm("FeedBackForm"));
        System.out.println(feedBackForm);
    }

    
    public static void main(String[] args) throws Exception {
        (new App()).withRegistry();
    }
}
