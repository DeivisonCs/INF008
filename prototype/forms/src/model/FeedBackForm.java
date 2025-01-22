package model;

public class FeedBackForm extends Form{
    private Float score;
    private String comments;

    public FeedBackForm(String fullName, String email, Float score, String comments){
        super(fullName, email);
        this.score = score;
        this.comments = comments;
    }
   
    public FeedBackForm(FeedBackForm form){
        super(form.getFullName(), form.getEmail());
        this.score = form.getScore();
        this.comments = form.getComments();
    }

    @Override
    public Form getClone() {
        return new FeedBackForm(this);
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "SignUpForm" +
                "\n\tName: " + getFullName() + 
                "\n\tEmail: " + getEmail() + 
                "\n\tScore: " + getScore() + 
                "\n\tComment: " + getComments();
    }
}
