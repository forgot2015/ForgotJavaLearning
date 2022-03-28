package algorithm;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Author: zongfulin
 * Date: 2021/3/31
 * Time: 4:48 PM
 * Description:算法汇总
 */
public class AlgorithmTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
        hashMap.put("e",5);
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
    }

    private void swap(int a, int b) {

    }
}
