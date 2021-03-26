package schema.structure.adapter;

/**
 * Created by forgot on 6/9/2017.
 * 适配器模式
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target =new Adapter();
        target.targetMethod();
    }
}
