package algorithm.sort.insert;

/**
 * Created by forgot on 5/24/2017.
 * 希尔排序，是插入排序的变形
 * 不稳定
 */
public class ShellSort {

    /**
     * 分两个方法来写
     *
     * @param a
     * @param n
     */
    public void shellSort1(int[] a, int n) {
        int dk = n / 2;
        while (dk >= 1) {
            shellSortDk(a, n, dk);
            dk = dk / 2;
        }
    }

    private void shellSortDk(int[] a, int n, int dk) {
        for (int i = dk; i < n; i++) {
            if (a[i] < a[i - dk]) {
                int j;
                int x = a[i];
                a[i] = a[i - dk];
                for (j = i - dk; j > dk - 1 && x < a[j - dk]; j -= dk) {
                    a[j] = a[j - dk];
                }
                a[j] = x;
            }


        }
    }


    /**
     * 一个方法里写了,有问题?
     *
     * @param a
     * @param n
     */
    public void shellSort2(int[] a, int n) {
        int j, dk;
        for (dk = n / 2; dk >= 1; dk /= 2) {
            for (int i = dk; i < n; i++) {
                if (a[i] < a[i - dk]) {
                    int x = a[i];
                    a[i] = a[i - dk];
                    for (j = i - dk; j > dk && x < a[j - dk]; j = j + dk) {
                        a[j] = a[j - dk];
                    }
                    a[j] = x;
                }
            }
        }
    }
}
