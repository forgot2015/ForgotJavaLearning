package schema.behavior.iterator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:42 PM
 * Description:集合
 */
public interface Aggregate {
    int size();

    String get(int index);

    void add(String str);

    void remove(String str);

    /**
     * @return 返回容器的迭代器
     */
    Iterator iterator();
}
