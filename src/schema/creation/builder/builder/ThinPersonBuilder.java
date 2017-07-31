package schema.creation.builder.builder;

/**
 * Created by forgot on 2017/6/18.
 */
public class ThinPersonBuilder extends PersonBuilder {
    @Override
    public void buildHead() {
        System.out.println("建造瘦子的头");
    }

    @Override
    public void buildBody() {
        System.out.println("建造瘦子的身体");
    }

    @Override
    public   void buildArm() {
        System.out.println("建造瘦子的手");
    }

    @Override
    public  void buildLeg() {
        System.out.println("建造瘦子的脚");
    }
}
