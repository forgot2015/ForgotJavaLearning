package base.collectionframe.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zongfulin
 * Date: 2021/4/6
 * Time: 14:55
 * Description: ArrayList,LinkedList,Vector,Stack
 */
public class ListTest {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<String> stringList = new ArrayList<>(0);
        stringList.add("one");
        System.out.println(stringList.get(0));
        System.out.println(stringList.size());
//        System.out.println(stringList.get(-1));

        List<String> list = new ArrayList<String>();
        //CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("a");
        for (String str : list) {
//            list.remove(str);
        }

        System.out.println("LinkedList");
        List<String> stringList1 = new LinkedList<>();
        stringList1.add("linkedList");
        System.out.println(stringList1.get(0));
        System.out.println(stringList1.size());

        System.out.println(new Date());
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
        System.err.println(new Date());
    }

}
