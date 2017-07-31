package schema.creation.simpleFactory;

/**
 * Created by forgot on 2017/6/17.
 */
public class ToyotaCar extends Car {
    @Override
    String getName() {
        return "丰田车";
    }

    @Override
    public String drive() {
        return "120km/h";
    }
}
