package schema.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 5:24 PM
 * Description:
 */
public class Websites {
    List<WebRes> list = new ArrayList<>();//元素集合

    public void accept(Visitor visitor) {
        Iterator<WebRes> iterator = list.iterator();
        while (iterator.hasNext()) {//迭代遍历访问
            iterator.next().accept(visitor);
        }
    }

    public void addWeb(WebRes webRes) {
        list.add(webRes);
    }
}