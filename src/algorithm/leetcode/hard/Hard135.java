package algorithm.leetcode.hard;

import java.util.Arrays;

/**
 * @author zongfulin
 * Date: 2021/6/14
 * Time: 15:44
 * Description:135. 分发糖果
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * <p>
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * <p>
 * 每个孩子至少分配到 1 个糖果。
 * 评分更高的孩子必须比他两侧的邻位孩子获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,0,2]
 * 输出：5
 * 解释：你可以分别给这三个孩子分发 2、1、2 颗糖果。
 * 示例 2：
 * <p>
 * 输入：[1,2,2]
 * 输出：4
 * 解释：你可以分别给这三个孩子分发 1、2、1 颗糖果。
 * 第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
 * 通过次数80,799提交次数167,840
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/candy
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Hard135 {
    public static void main(String[] args) {
//        int[] ratings = {1, 2, 2};
//        int[] ratings = {1, 3, 2, 2, 1};
        int[] ratings = {1, 3, 4, 5, 2};
        System.out.println(new Hard135().candy(ratings));
    }

    public int candy(int[] ratings) {
        int length = ratings.length;
        if (length <= 1) {
            return length;
        }

        int[] counts = new int[ratings.length];
        Arrays.fill(counts, 1);

        for (int i = 1; i < ratings.length; i++) {
//            从左边遍历时,右边若评分高,则获得糖果为左边+1
            if (ratings[i] > ratings[i - 1]) {
                counts[i] = counts[i - 1] + 1;
            }
//            System.out.println(Arrays.toString(counts));
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
//            从右边遍历时,左边若评分高,还要比较左边是否糖果数已比右边高,若否,则为右边+1
            if (ratings[i] > ratings[i + 1]) {
                if (counts[i] <= counts[i + 1]) {
                    counts[i] = counts[i + 1] + 1;
                }
            }
//            System.out.println(Arrays.toString(counts));
        }

        int sum = 0;
        for (int count : counts) {
            sum += count;
        }
        return sum;
    }
}
