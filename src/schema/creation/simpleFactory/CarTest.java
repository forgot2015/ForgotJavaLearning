package schema.creation.simpleFactory;

/**
 * Created by forgot on 2017/6/17.
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 =new BenzCar();
        Car car2 =new BMWCar();
        Car car3 =new ToyotaCar();
        System.out.println(car1.getName()+":"+car1.drive());
        System.out.println(car2.getName()+":"+car2.drive());
        System.out.println(car3.getName()+":"+car3.drive());

        System.out.println("===静态工厂===");
        Car car4 = CarFactory.newCar("BMW");
        System.out.println(car4.getName()+":"+car4.drive());
    }
}
