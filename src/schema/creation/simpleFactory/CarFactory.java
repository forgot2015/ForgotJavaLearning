package schema.creation.simpleFactory;

/**
 * Created by forgot on 2017/6/17.
 */
public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {
    }

    public CarFactory getInstance() {
        return instance;
    }

    public static Car newCar(String string) {
        switch (string) {
            case "Benz":
                return new BenzCar();
            case "BMW":
                return new BMWCar();
            case "Toyota":
                return new ToyotaCar();
            default:
                return null;
        }
    }
}
