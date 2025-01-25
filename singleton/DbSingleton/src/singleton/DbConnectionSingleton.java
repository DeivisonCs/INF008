package singleton;

public class DbConnectionSingleton {

    private static DbConnectionSingleton connection;

    private DbConnectionSingleton(){
        System.out.println("Creating Connection...");
    }

    public static DbConnectionSingleton getInstace(){
        DbConnectionSingleton result = connection;

        if(result == null){
            connection = result = new DbConnectionSingleton();
        }

        return result;
    }

}
