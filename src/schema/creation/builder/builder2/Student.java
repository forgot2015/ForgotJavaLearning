package schema.creation.builder.builder2;

/**
 * @author zongfulin
 * Date: 2021/4/24
 * Time: 10:16
 * Description:
 */
public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private Student(Builder builder) {
        this.name = builder.mName;
        this.age = builder.mAge;
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

        public Student build() {
            return new Student(this);
        }
    }
}
