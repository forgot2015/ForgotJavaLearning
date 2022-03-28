package algorithm.sort.exchange;

/**
 * Created by forgot on 5/24/2017.
 * 冒泡排序，属于交换排序
 */
public class BubbleSort {

    /**
     * 最原始版本冒泡排序，效率低，稳定
     * 从小到大排序
     */
    public void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void bubble(int[] data) {
        int length = data.length;
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;
                }
            }

        }
    }

    /**
     * 增加标志位exchange，若某一轮for循环没有进行任何元素交换，说明已经排序好了，那就不用再比较下去了， return返回
     *
     * @param a
     * @param n
     */
    public void bubbleSort2(int[] a, int n) {
        boolean exchange;
        for (int i = 0; i < n - 1; i++) {
            exchange = false;
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


    /**
     * 再改进，一次排序排列两个数, max和min,同样增加标志位判断
     *
     * @param a
     * @param n
     */
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

    /**
     * 冒泡排序优化2
     *
     * @param arr
     * @param size
     */
    void bubbleSort4(int[] arr, int size) {
        int i = 0, j = 0;
        int k = size - 1;
        //pos变量用来标记循环里最后一次交换的位置
        int pos = 0;

        for (i = 0; i < size - 1; i++) {
            //一共要排序size-1次
            //每次遍历标志位都要先置为0，才能判断后面的元素是否发生了交换
            int flag = 0;

            for (j = 0; j < k; j++) {
                //选出该趟排序的最大值往后移动
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    //只要有发生了交换，flag就置为1
                    flag = 1;
                    //循环里最后一次交换的位置 j赋给pos
                    pos = j;
                }
            }

            k = pos;
            //判断标志位是否为0，如果为0，说明后面的元素已经有序，就直接return
            if (flag == 0) {
                return;
            }
        }
    }

}
