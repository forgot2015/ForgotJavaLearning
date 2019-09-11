package sort.select;

/**
 * Created by forgot on 2017/6/12.
 * 二元选择排序，一次确定两个数，min和max
 */
public class BinarySelectSort {
    public void binarySelectSort(int[] a, int n) {
        for (int i = 0; i < (n + 1) / 2; i++) {
            int min = i;
            int max = i;
            for (int j = i; j < n - 1 - i; j++) {
                if (a[j] < a[min]) {
                    min = j;
                } else if (a[j] > a[max]) {
                    max = j;
                }
            }

            if (i != min) {
                int x = a[i];
                a[i] = a[min];
                a[min] = x;
            }
            if (n - 1 - i != max) {
                int x = a[n - 1 - i];
                a[n - 1 - i] = a[max];
                a[max] = x;
            }
        }
    }
}
