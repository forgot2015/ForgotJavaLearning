package book.effectivejava.builder;

/**
 * @author zongfulin
 * Date: 2021/4/24
 * Time: 10:16
 * Description:
 */
public class Student2 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class Builder {
        private String mName;
        private int mAge;

        public Builder setName(String name) {
            this.mName = name;
            return this;
        }

        public Builder setAge(int age) {
            this.mAge = age;
            return this;
        }

        public Student2 build() {
            return new Student2(mName, mAge);
        }
    }
}
