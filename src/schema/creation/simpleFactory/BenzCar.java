package schema.creation.simpleFactory;

/**
 * Created by forgot on 2017/6/17.
 */
public class BenzCar extends Car {
    String name;

    @Override
    String getName() {
        return "奔驰";
    }

    @Override
    public String drive() {
        return "200km/h";
    }
}
