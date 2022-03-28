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

        List<String> arrayList = new ArrayList<String>();
        //CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        arrayList.add("a");
        for (String str : arrayList) {
//            list.remove(str);
        }

        System.out.println("LinkedList");
        List<String> linkList = new LinkedList<>();
        linkList.add("linkedList");
        System.out.println(linkList.get(0));
        System.out.println(linkList.size());

        System.out.println(new Date());
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
        System.err.println(new Date());
    }

}
