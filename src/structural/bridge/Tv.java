package structural.bridge;

public class Tv implements Device{

    private Boolean enable;
    private Integer volume;
    private Integer channelName;

    public Tv() {
        enable = false;
    }

    @Override
    public boolean isEnable() {
        return getEnable();
    }

    @Override
    public void enable() {
       setEnable(true);
    }

    @Override
    public void disable() {
        setEnable(false);
    }

    @Override
    public Integer getVolume() {
        return getVolume();
    }

    @Override
    public void setVolume(int percent) {
        setVolume(percent);
    }

    @Override
    public Integer getChannel() {
        return getChannel();
    }

    @Override
    public void setChannel(Integer channel) {
        setChannelName(channel);
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getChannelName() {
        return channelName;
    }

    public void setChannelName(Integer channelName) {
        this.channelName = channelName;
    }
}
