package factory;

public class DatabaseLogManager implements ILogger {
    @Override
    public void Log(String message) {
        System.out.println("Database loglama işlemi:" + message);
    }
}
