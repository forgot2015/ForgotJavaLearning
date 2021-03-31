package schema.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 11:30 AM
 * Description:
 */
public class Context {
    Map<String, Object> map = new HashMap<>();

    public void put(String key, int value) {
        map.put(key, value);
    }

    public int get(String key) {
        return (int) map.get(key);
    }

}
