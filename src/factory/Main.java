package factory;

public class Main {
    public static void main(String[] args){
        ILogger logger = new LoggerFactory().CreateLogger(LoggerType.DatabaseLogger);
        logger.Log("system format exception");
    }
}
