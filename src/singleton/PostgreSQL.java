package singleton;

public class PostgreSQL  {
    public static String name = "PostgreSQL";
    private static  PostgreSQL instance = null;

    private PostgreSQL(){

    }
    public synchronized static void createInstance(){
        if(instance == null)
            instance = new PostgreSQL();
    }

    public static PostgreSQL getInstance() {
        if(instance == null)
            createInstance();
        return instance;
    }
    public void connect(){
        Database.getInstance().connect(name);
    }
}
