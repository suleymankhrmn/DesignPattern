package structural.bridge;

public class Main {
    public static void main(String[] args){
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);

        Radio radio = new Radio();
        remote = new AdvanceRemoteControl(radio);
    }


}
