package base.collectionframe;

import java.util.HashMap;

/**
 * @author zongfulin
 * Date: 2021/4/22
 * Time: 17:21
 * Description:
 */
public class HashMapTest {
    public static void main(String[] args) {
//        设置为 0 也没用,建表时会变为 1
//        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
        HashMap<Integer,String> hashMap = new HashMap<>(0);
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
    }
}
