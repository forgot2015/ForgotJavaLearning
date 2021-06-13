package base.collectionframe;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author zongfulin
 * Date: 2021/4/23
 * Time: 15:49
 * Description:
 */
public class StudentBean implements Serializable {
    private static final long serialVersionUID = -7323203095461773342L;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StudentBean that = (StudentBean) o;

        if (age != that.age) {
            return false;
        }
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
