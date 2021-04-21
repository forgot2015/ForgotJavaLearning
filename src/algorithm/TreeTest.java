package algorithm;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zongfulin
 * Date: 2021/4/21
 * Time: 09:42
 * Description:
 */
public class TreeTest {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();
        System.out.println("start");
        for (int i = 0; i < 1000_000_000; i++) {
            String a = i + "string";
            stringMap.put(i, a);
        }
        System.out.println("end ,size = " + stringMap.size());
    }
}
