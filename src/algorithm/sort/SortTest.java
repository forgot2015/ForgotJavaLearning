package algorithm.sort;

import algorithm.sort.exchange.BubbleSort;

import java.util.Arrays;

/**
 * 排序算法
 * 正序反序都要写
 * <p>
 * Created by forgot on 2017/6/11.
 * 排序算法分为内部排序和外部排序。外部排序是指当数据量太大时，用内存已经无法一次性容纳所有排序记录了，需要运用外部存储的情况
 * 内部排序分为：
 * 插入排序（直接插入排序，二分插入排序，希尔排序）
 * 选择排序（简单选择排序和堆排序）
 * 交换排序（冒泡排序和快速排序）
 * 归并排序和基数排序
 * <p>
 * 性能来说，数据容量较大时，推荐快速排序，归并排序和堆排序，时间复杂度皆为O(nlog2n)，其中又以快速排序为最佳
 * 外部排序算法:多路平衡归并算法,置换-选择排序算法
 */
public class SortTest {
    public static void main(String[] args) {
        int[] ints = new int[]{53, 28, 15, 7, 22, 4, 39, 26, 88, 35};
        //冒泡排序的三种写法
//        new BubbleSort().bubbleSort(ints,8);
//        new BubbleSort().bubbleSort2(ints,8);
//        new BubbleSort().bubbleSort3(ints,8);
        new BubbleSort().bubble(ints);
        //快速排序
//        new QuickSort().quickSort(ints,0,7);


        //插入排序
//        new InsertSort().insertSort(ints, 10);

        //希尔排序
//        new ShellSort().shellSort1(ints,10);

        //二分插入排序
//        new BinarySelectSort().binarySelectSort(ints, 10);

        System.out.println("======排序后======");
        System.out.println(Arrays.toString(ints));
        //        for (int i:ints ) {
//            System.out.print(i+",");
//        }

    }
}
