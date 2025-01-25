import singleton.DbConnectionSingleton;

public class App {
    public static void main(String[] args) throws Exception {
        DbConnectionSingleton db1 = DbConnectionSingleton.getInstace();
        DbConnectionSingleton db2 = DbConnectionSingleton.getInstace();

    }
}
