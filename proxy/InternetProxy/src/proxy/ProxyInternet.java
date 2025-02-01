package proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Internet;

public class ProxyInternet implements Internet{
    private Map<String, String> urlCache;
    private List<String> forbbindenUrls;
    private Internet protocol;

    public ProxyInternet(Internet internet){
        this.protocol = internet;
        this.forbbindenUrls = new ArrayList<>(Arrays.asList("www.youtube", "www.onlyIncel"));
        this.urlCache = new HashMap<>();
    }

    public ProxyInternet(Internet internet, List<String> forbbindenUrls){
        this.protocol = internet;
        this.forbbindenUrls = forbbindenUrls;
        this.urlCache = new HashMap<>();
    }

    @Override
    public void connecToSite(String url) {
        if(this.forbbindenUrls.contains(url)){
            System.out.println("Access Denied");
            return;
        }

        if(!this.urlCache.containsKey(url)){
            System.out.println("Searching URL...");
            this.urlCache.put(url, url + " content");
        }

        this.protocol.connecToSite(this.urlCache.get(url));
    }

}
