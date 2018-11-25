import java.util.ArrayList;
import java.util.List;

public class Exercise {
    List<String> names;
    String name1;
    String name2;

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.initNameList();
        exercise.initName1();
        exercise.printName1();

        exercise.changeNameList1();
        exercise.printName1();

        exercise.initName1();
        exercise.printName1();
    }

    private void initNameList() {
        names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add("forgot" + i);
        }
    }

    private void initName1() {
        name1 = names.get(0);
    }

    private void changeNameList1() {
        names.set(0, "forgot111");
    }

    private void printName1() {
        System.out.println(name1);
    }

}
