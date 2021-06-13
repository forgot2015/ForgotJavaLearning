package base.collectionframe.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Author: zongfulin
 * Date: 2021/4/6
 * Time: 09:57
 * Description:Set,TreeSet,HashSet,LinkedHashSet
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet<String> bookSet = new HashSet<>();
        bookSet.add("<<人生的智慧>>");
        bookSet.add("<<作为表面的意象的时间>>");
        bookSet.add("<<穷爸爸 富爸爸>>");

        Iterator iterator = bookSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        bookSet.contains("a");

        for (String s : bookSet) {
            System.out.println(s);
        }

    }

}
