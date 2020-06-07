package factory;

public class EmailLogManager implements ILogger {
    @Override
    public void Log(String message) {
        System.out.println("Email loglama işlemi:" + message);
    }
}
