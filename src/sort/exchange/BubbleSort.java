package sort.exchange;

/**
 * Created by forgot on 5/24/2017.
 * 冒泡排序，属于交换排序
 */
public class BubbleSort {

    /*最原始版本冒泡排序，效率低，稳定*/
    public void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = x;
                }
            }
        }
    }


    /*增加标志位exchange，若某一轮for循环没有进行元素交换，说明已经排序好了，那就不用再比较下去了， return返回*/
    public void bubbleSort2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean exchange = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = x;
                    exchange = true;
                }
            }
            if (!exchange) {
                return;
            }

        }
    }


    /*再改进，一次排序排列两个数, max和min,同样增加标志位判断*/
    public void bubbleSort3(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean exchange = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int x = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = x;
                    exchange = true;
                }

            }
            for (int j = n - 1 - i; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                    exchange = true;
                }
            }
            if (!exchange) {
                return;
            }

        }
    }


}
