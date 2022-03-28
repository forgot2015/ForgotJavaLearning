package algorithm.sort.exchange;

/**
 * 快速排序
 * 优化方案
 */
public class QuickSort {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotPosition = partition(arr, low, high);
            quickSort(arr, low, pivotPosition - 1);
            quickSort(arr, pivotPosition + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && pivot <= arr[high]) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) {
                low++;
            }
            arr[high] = arr[low];

        }
        arr[low] = pivot;
        return low;
    }


    //一个方法里写
//    void quick_sort(int s[], int l, int r)
//    {
//        if (l < r)
//        {
//            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
//            int i = l, j = r, x = s[l];
//            while (i < j)
//            {
//                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
//                    j--;
//                if(i < j)
//                    s[i++] = s[j];
//
//                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
//                    i++;
//                if(i < j)
//                    s[j--] = s[i];
//            }
//            s[i] = x;
//            quick_sort(s, l, i - 1); // 递归调用
//            quick_sort(s, i + 1, r);
//        }
//    }
}
