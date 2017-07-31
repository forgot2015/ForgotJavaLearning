package schema.creation.simpleFactory;

/**
 * Created by forgot on 2017/6/17.
 */
public class BMWCar extends Car{
    @Override
    String getName() {
        return "宝马";
    }


    @Override
    public String drive() {
        return "150km/h";
    }
}
