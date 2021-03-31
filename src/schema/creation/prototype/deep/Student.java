package schema.creation.prototype.deep;

import java.io.Closeable;
import java.io.IOException;

/**
 * Author: zongfulin
 * Date: 2021/3/30
 * Time: 2:51 PM
 * Description:
 */
public class Student implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
//            若不加这句,则没法实现深克隆,导致改变地址的话,克隆的对象地址也会跟着改变
            student.setAddress(student.getAddress().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}
