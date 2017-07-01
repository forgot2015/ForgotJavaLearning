package headfirstjava.two;

/**
 * Created by forgot on 2017/6/25.
 */
public class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
