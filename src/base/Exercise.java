package base;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    List<String> names;
    String name1;

    List<Student> studentList;
    Student student1;

    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.initNameList();
        exercise.initName1();
        exercise.printName1();

//       name1是引用类型, 修改了索引 0 的数据后,实际上是指向了一个新的地址 而不是改变原来字符串的值,故name1 的值并没有变化
        exercise.changeNameList1();
//        System.out.println(exercise.names.get(0));
        exercise.printName1();

//        重新将 name1 指向 names[0] ,才会改变 name1 的值
        exercise.initName1();
        exercise.printName1();

//        同理,即便是引用类型也一样
        exercise.initStudentList();
        exercise.initStudent1();
        exercise.printStudent1();

        exercise.changeStudentList1();
        exercise.printStudent1();
//修改引用类型中的String,依然无法改变student1 的值
        exercise.changeStudentList2();
        exercise.printStudent1();

        exercise.initStudent1();
        exercise.printStudent1();
    }

    private void initStudentList() {
        studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("student" + i);
            studentList.add(student);
        }
    }

    private void initStudent1() {
        student1 = studentList.get(0);
    }

    private void changeStudentList1() {
        studentList.set(0, new Student("new Student"));
    }

    private void changeStudentList2() {
        studentList.get(0).setName("new Student2");
    }

    private void printStudent1() {
        System.out.println("student1 = " + student1.toString());
        System.out.println("studentList.get(0) = " + studentList.get(0) + "\n");
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

    class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

}
