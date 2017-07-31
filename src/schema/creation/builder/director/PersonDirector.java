package schema.creation.builder.director;

import schema.creation.builder.builder.PersonBuilder;

/**
 * Created by forgot on 2017/6/18.
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        System.out.println("director 指挥 builder进行建造");
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArm();
        personBuilder.buildLeg();
    }
}
