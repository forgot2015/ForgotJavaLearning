package sort.insert;

/**
 * Created by forgot on 2017/6/12.
 * 二分插入排序(折半插入排序)，属于插入排序
 * 统一计算需要挪动的空间，然后再统一插入
 * 稳定的，不会改变相同元素的相对顺序
 * 时间复杂度O(n^2)
 */
public class BinaryInsertSort {
    void binaryInsertSort(int[] a, int n) {
        int i,j,x,low,high,mid;
        for (i = 1; i < n; i++) {
           if (a[i]<a[i-1]){
               x = a[i];
               low = 0;high = i;
               while(low<=high){
                   mid=(low+high)/2;
                   if (a[mid]>x){
                       high=mid-1;
                   }else{
                       low=mid+1;
                   }
               }
               for (j=i-1; j>=high+1;j--) {
                   a[j+1]=a[j];
               }a[high+1]=x;
           }

        }
    }
}
