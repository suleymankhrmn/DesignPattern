package singleton;

public class Main {
    public static void main(String[] args){
        MySQL.getInstance().connect();
        PostgreSQL.getInstance().connect();
    }
}
