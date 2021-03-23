package schema.creation.prototype.deep;

/**
 * Created by forgot on 2017/6/19.
 */
public class Prototype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
            String cloneName = prototype.getName();
            prototype.setName(cloneName);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
