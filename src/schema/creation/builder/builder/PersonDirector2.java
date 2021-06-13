package schema.creation.builder.builder;

import schema.creation.builder.builder.PersonBuilder;

/**
 * Created by forgot on 2017/6/18.
 */
public class PersonDirector2 {
    private PersonBuilder personBuilder;

    public PersonDirector2(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        System.out.println("director2 指挥 builder进行建造");
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArm();
        personBuilder.buildLeg();
    }
}
