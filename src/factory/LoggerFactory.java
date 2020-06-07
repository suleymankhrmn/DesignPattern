package factory;

public class LoggerFactory {
    public static ILogger CreateLogger(LoggerType loggerType){
        switch (loggerType){
            case DatabaseLogger:
                return new DatabaseLogManager();
            case FileLogger:
                return  new FileLogManager();
            case EmailLogger:
                return new EmailLogManager();
            case None:
                return null;
        }
        return null;
    }
}
