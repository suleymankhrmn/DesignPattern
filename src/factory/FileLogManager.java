package factory;

public class FileLogManager implements ILogger {
    @Override
    public void Log(String message) {
        System.out.println("File loglama işlemi:" + message);
    }
}
