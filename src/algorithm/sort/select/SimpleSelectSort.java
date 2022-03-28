package algorithm.sort.select;

/**
 * Created by forgot on 5/24/2017.
 * 简单选择排序，属于选择排序
 * 每一次循环，选出剩余当中最小的数，将其顺序排到左边
 */
public class SimpleSelectSort {
    public void simpleSelectSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                //选出剩余当中最小的数
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            //将最小的数与当前索引互换
            if (min != i) {
                int x = a[i];
                a[i] = a[min];
                a[min] = x;
            }

        }
    }
}
