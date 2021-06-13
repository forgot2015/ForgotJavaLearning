package algorithm.leetcode.middle;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author zongfulin
 * Date: 2021/6/13
 * Time: 19:49
 * Description:
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
 * <p>
 *
 * <p>
 * 示例1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s由英文字母、数字、符号和空格组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(new Middle3().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int ans = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            if (last[index] != -1) {
//                如果某字符出现过,则去计算要滑动几位
                start = Math.max(start, last[index] + 1);
            }
            ans = Math.max(ans, i - start + 1);
            last[index] = i;
        }

        return ans;
    }

    /**
     * 法 2 同理,只不过用了 HashMap 来代替数组操作
     */
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

}
