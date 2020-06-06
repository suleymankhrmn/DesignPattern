public class BillPugh {
    private BillPugh(){
        System.out.println("BillPugh is created");
    }
    private static class SingletonHelper{
        private static final BillPugh instance = new BillPugh();
    }
    public static BillPugh getInstance(){
        return SingletonHelper.instance;
    }
}
