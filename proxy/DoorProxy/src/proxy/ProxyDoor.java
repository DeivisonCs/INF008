package proxy;

import model.Door;

public class ProxyDoor implements Door{
    private String defaultDoorPassword;
    private Door door;

    public ProxyDoor(Door door){
        this.door = door;
        this.defaultDoorPassword = "$eCr5te";
    }

    @Override
    public void open(String password) {
        if(!this.checkPassword(password)){
            System.out.println("Access Denied");
            return;
        }
        
        this.door.open(password);
    }

    @Override
    public void close() {
        this.door.close();
    }

    private Boolean checkPassword(String password){
        return this.defaultDoorPassword.equals(password);
    }
    
}
