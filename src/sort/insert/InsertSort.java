package sort.insert;

import java.util.List;

/**
 * Created by forgot on 5/24/2017.
 * 直接插入排序，一次一次比较，一个一个插入
 * 时间复杂度 O（n^2）
 * 空间复杂度 O(1)
 */
public class InsertSort {

    public void insertSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                int j;
                int x = a[i];
                a[i] = a[i - 1];
                for (j = i - 1; j > 0 && x < a[j - 1]; j--) {
                    a[j] = a[j - 1];
                }
                a[j] = x;
            }

        }
    }


}
