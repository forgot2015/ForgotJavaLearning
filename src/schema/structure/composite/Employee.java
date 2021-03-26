package schema.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:30 PM
 * Description:
 */
public class Employee {
    private String name;
    private String title;
    private List<Employee> subordinates;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
        subordinates = new ArrayList<>();
    }

    public void print() {
        System.out.println("name=" + name + ", title=" + title);
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
