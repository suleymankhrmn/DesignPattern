public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Class is created");
    }
    public  static Singleton getSingleton(){
        if(singleton == null){ // multithread
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
