package algorithm.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zongfulin
 * Date: 2021/6/13
 * Time: 23:31
 * Description:
 */
public class Easy1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(new Easy1().twoSum(nums, target)));
    }

    /**
     * 我的渣解法,时间复杂度在 O(n2)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0, size = nums.length; i < size; i++) {
            int other = target - nums[i];
            for (int j = i + 1; j < size; j++) {
                if (nums[j] == other) {
                    int[] ints = new int[2];
                    ints[0] = i;
                    ints[1] = j;
                    return ints;
                }
            }
        }
        return new int[]{};
    }

    /**
     * 哈希解法,复杂度 O(n),优秀
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int other = target - nums[i];
            if (map.containsKey(other)) {
                return new int[]{map.get(other), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
