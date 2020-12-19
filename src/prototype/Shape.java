package prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected Type type;


    abstract void draw();
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
