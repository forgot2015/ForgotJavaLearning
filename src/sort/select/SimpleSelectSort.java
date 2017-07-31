package sort.select;

/**
 * Created by forgot on 5/24/2017.
 * 简单选择排序，属于选择排序
 */
public class SimpleSelectSort {
    public void simpleSelectSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int x = a[i];
                a[i] = a[min];
                a[min] = x;
            }

        }
    }
}
