package algorithm.sort.insert;

/**
 * Created by forgot on 5/24/2017.
 * 直接插入排序，第二个元素开始跟前面的元素进行比较，
 * 若比前面的元素小,若不断往前移动,直到第一位,或者不小于前面的数时才停下来.
 * 时间复杂度 O（n^2）
 * 空间复杂度 O(1)
 */
public class InsertSort {

    public void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                //若右边的数比左边的小,则左边的数往右移
                int x = arr[i];
                arr[i] = arr[i - 1];
                int j;
                for (j = i - 1; j > 0 && x < arr[j - 1]; j--) {
                    //若右边的仍然数比左边的小,则左边的数不断往右移
                    arr[j] = arr[j - 1];
                }
                //当停下来后,才把一开始右边的值赋值过来
                arr[j] = x;
            }
        }
    }

}
