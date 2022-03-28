package algorithm.search;

/**
 * @author zongfulin
 * Date: 2022/3/26
 * Time: 22:45
 * Description:二分查找算法. 先用快排将乱序的序列进行排序,然后用二分查找法来查找
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 7, 22, 56, 78, 79, 80};

        System.out.println(binarySearch(arr, 22));
        System.out.println(binarySearchRecursion(arr, 0, arr.length - 1, 22));
    }

    /**
     * 二分查找的非递归实现
     */
    private static int binarySearch(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] > search) {
                //向左查找
                end = mid - 1;
            } else {
                //向右查找
                start = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找的递归实现
     */
    public static int binarySearchRecursion(int[] arr, int left, int right, int search) {
        //left:左边索引，right:右边索引，value:查找的元素
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] > search) {
            //向左递归
            return binarySearchRecursion(arr, left, mid - 1, search);
        } else {
            //向右递归
            return binarySearchRecursion(arr, mid + 1, right, search);
        }
    }
}
