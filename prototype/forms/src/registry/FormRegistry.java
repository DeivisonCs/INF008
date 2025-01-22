package registry;

import java.util.HashMap;
import java.util.Map;

import model.Address;
import model.FeedBackForm;
import model.Form;
import model.SignUpForm;

public class FormRegistry {
    private Map<String, Form> forms = new HashMap<>();

    public FormRegistry(){
        Form defaultSignForm = new SignUpForm("name", "xxxx@gamil.com", "*******", new Address("xxxxx", "xxxx"));
        Form defaultFeedBackForm = new FeedBackForm("name", "xxxx@gmail.com", (float)0.0, "comments");

        this.forms.put("SignUpForm", defaultSignForm);
        this.forms.put("FeedBackForm", defaultFeedBackForm);
    }

    public Form getForm(String key){
        return this.forms.get(key).getClone();
    }
}
