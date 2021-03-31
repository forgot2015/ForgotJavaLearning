package schema.structure.composite;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:13 PM
 * Description:组合模式.将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
 * Android 中的 View 和 ViewGroup 就是组合模式
 */
public class CompositeTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("Lin", "CEO");

        Employee pm = new Employee("Jiang", "PM");
        Employee techTL = new Employee("Guan", "TechTL");

        ceo.add(pm);
        ceo.add(techTL);

        Employee ui = new Employee("Zhao", "UI");
        Employee ux = new Employee("Lei", "UX");
        pm.add(ui);
        pm.add(ux);

        Employee front = new Employee("Chen", "FRONT");
        Employee back = new Employee("He", "BACK");
        techTL.add(front);
        techTL.add(back);

//        System.out.println(ceo.toString());
        ceo.print();
        for (Employee e : ceo.getSubordinates()
        ) {
            System.out.println(e);
            for (Employee i : e.getSubordinates()
            ) {
                System.out.println(i);
            }
        }



    }
}
