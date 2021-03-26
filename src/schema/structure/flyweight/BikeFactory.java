package schema.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: zongfulin
 * Date: 2021/3/26
 * Time: 5:58 PM
 * Description:
 */
public class BikeFactory {
    private static Map<String, IBike> pool = new HashMap<>();

    public IBike getBike(String name) {
        IBike bike = null;
        if (pool.containsKey(name)) {
            System.out.println(name + " 押金已交,直接用车:" + name);
            bike = pool.get(name);
        } else {
            bike = new ShareBike();
            pool.put(name, bike);
            System.out.println(name + " 新用户,交押金 100 元");
        }
        return bike;
    }
}
