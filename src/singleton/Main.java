package singleton;

public class Main {
    public static void main(String[] args){
        MySQL.getInstance().query("Mysql");
        PostgreSQL.getInstance().query("Postgresql");
    }
}
