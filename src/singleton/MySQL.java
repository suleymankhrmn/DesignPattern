package singleton;

public class MySQL {
    public static String name = "MYSQL";
    private static MySQL instance = null;

    private MySQL() {
    }

    public synchronized static void createInstance(){
        if(instance == null)
            instance = new MySQL();
    }

    public static MySQL getInstance() {
        if(instance == null)
            createInstance();
        return instance;
    }

    public void connect(){
        Database.getInstance().connect(name);
    }
}
