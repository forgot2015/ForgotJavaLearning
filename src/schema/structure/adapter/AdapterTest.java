package schema.structure.adapter;

/**
 * Created by forgot on 6/9/2017.
 */
public class AdapterTest {
    public static void main(String[] args) {
//        Adaptee adaptee = new Adaptee();
//        Adapter adapter = new Adapter(adaptee);
//        adapter.targetMethod();

        Target target =new Adapter();
        target.targetMethod();
    }
}
