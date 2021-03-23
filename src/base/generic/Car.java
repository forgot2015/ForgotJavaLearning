package base.generic;

public class Car<K> {
    private K k;

    public void set(K k) {
        this.k = k;
    }

    public K get() {
        return k;
    }

    public static void main(String[] args) {
        Car<String> stringCar = new Car<>();
        stringCar.set("stringCars");
        System.out.println(stringCar.get());

        BikeImpl2<String> bikeImpl2 = new BikeImpl2<>();
    }

    interface Bike<V> {
        <T> V ride(T t);

        V ride2(V v);

        V ride3();

        void ride4(V v);
    }
}

class BikeImpl implements Car.Bike<String> {

    @Override
    public <T> String ride(T t) {
        if (t instanceof String) {
            return (String) t;
        }
        return "empty string";
    }

    @Override
    public String ride2(String s) {
        return null;
    }

    @Override
    public String ride3() {
        return null;
    }

    @Override
    public void ride4(String s) {
    }
}

class BikeImpl2<T> implements Car.Bike<T> {

    @Override
    public <T1> T ride(T1 t1) {
        return null;
    }

    @Override
    public T ride2(T t) {
        return null;
    }

    @Override
    public T ride3() {
        return null;
    }

    @Override
    public void ride4(T t) {

    }
}
