import factory.ILogger;
import factory.LoggerFactory;
import factory.LoggerType;

public class App {
    public static  void main(String[] args){
        for(int i = 0; i < 10; i++){
            Singleton singleton = Singleton.getSingleton();
            BillPugh billPugh = BillPugh.getInstance();
        }
        ILogger logger = new LoggerFactory().CreateLogger(LoggerType.DatabaseLogger);
        logger.Log("system format exception");

    }
}
