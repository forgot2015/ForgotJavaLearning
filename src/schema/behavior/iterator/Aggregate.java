package schema.behavior.iterator;

/**
 * Author: zongfulin
 * Date: 2021/3/29
 * Time: 1:42 PM
 * Description:
 */
public interface Aggregate {
    int size();
    String get(int index);
    void add(String str);
    void remove(String str);
    Iterator iterator();//返回容器的迭代器
}
