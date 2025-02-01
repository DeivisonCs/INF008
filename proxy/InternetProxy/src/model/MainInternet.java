package model;

public class MainInternet implements Internet{

    @Override
    public void connecToSite(String url) {
        System.out.println("Opened connection to " + url);
    }

}
