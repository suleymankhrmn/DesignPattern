package singleton;

public class Database {
    private static Database instance = null;

    private Database() {
        System.out.println("Create new object");
    }

    public synchronized static void createInstance(){
        if(instance == null)
            instance = new Database();
    }

    public static Database getInstance() {
        if(instance == null)
            createInstance();
        return instance;
    }
    public void connect(String databaseName){
        System.out.println(databaseName + " query process");
    }
}
