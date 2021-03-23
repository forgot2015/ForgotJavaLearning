package schema.creation.builder;

import schema.creation.builder.builder.FatPersonBuilder;
import schema.creation.builder.builder.PersonBuilder;
import schema.creation.builder.builder.ThinPersonBuilder;
import schema.creation.builder.director.PersonDirector;
import schema.creation.builder.director.PersonDirector2;

/**
 * Created by forgot on 2017/6/18.
 * 建造者模式仅仅只比工厂模式多了一个“指挥类”的角色。在建造者模式图中，假如把这个指挥类看做是最终调用的客户端，
 * 那么图中剩余的部分就可以看作是一个简单的工厂模式了。
 * <p>
 * 与工厂模式相比，建造者模式一般用来创建更为复杂的对象，因为对象的创建过程更为复杂，因此将对象的创建过程独立出来组成一个新的类——指挥类。
 * 也就是说，工厂模式是将对象的全部创建过程封装在工厂类中，由工厂类向客户端提供最终的产品；而建造者模式中，建造者类一般只提供产品类中各个
 * 组件的建造，而将具体建造过程交付给导演类。由导演类负责将各个组件按照特定的规则组建为产品，然后将组建好的产品交付给客户端。
 * <p>
 * Android中的AlertDialog就是Builder模式
 */
public class BuilderTest {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new FatPersonBuilder();
        PersonDirector director = new PersonDirector(personBuilder);
        director.createPerson();

        System.out.println("=============================");
        PersonDirector director1 = new PersonDirector(new ThinPersonBuilder());
        director1.createPerson();

//        System.out.println("=============================");
//        PersonDirector2 director2 = new PersonDirector2(new ThinPersonBuilder());
//        director2.createPerson();
    }
}
