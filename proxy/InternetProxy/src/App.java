import model.Internet;
import model.MainInternet;
import proxy.ProxyInternet;

public class App {
    public static void main(String[] args) throws Exception {
        Internet mainInternet = new ProxyInternet(new MainInternet());

        mainInternet.connecToSite("www.youtube");
        mainInternet.connecToSite("www.facebook");
        mainInternet.connecToSite("www.gupy");
        mainInternet.connecToSite("www.facebook");
    }
}
