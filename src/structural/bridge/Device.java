package structural.bridge;

public interface Device {
    boolean isEnable();
    void enable();
    void disable();
    Integer getVolume();
    void setVolume(int percent);
    Integer getChannel();
    void setChannel(Integer channel);

}
