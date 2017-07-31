package schema.creation.prototype.simple;

/**
 * Created by forgot on 2017/6/19.
 */
public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype =null;
        try{
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }return prototype;
    }
}
