package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * @author
 * @description 1103 缘分数
 * Score 20
 * Author 陈越
 * Organization 浙江大学
 * 所谓缘分数是指这样一对正整数 a 和 b，其中 a 和它的小弟 a−1 的立方差正好是另一个整数 c 的平方，而 c 正好是 b
 * 和它的小弟 b−1 的平方和。例如 8
 * 3
 * −7
 * 3
 * =169=13
 * 2
 * ，而 13=3
 * 2
 * +2
 * 2
 * ，于是 8 和 3 就是一对缘分数。
 * <p>
 * 给定 a 所在的区间 [m,n]，是否存在缘分数？
 * <p>
 * 输入格式：
 * 输入给出区间的两个端点 0<m<n≤25000，其间以空格分隔。
 * <p>
 * 输出格式：
 * 按照 a 从小到大的顺序，每行输出一对缘分数，数字间以空格分隔。如果无解，则输出 No Solution。
 * <p>
 * 输入样例 1：
 * 8 200
 * 输出样例 1：
 * 8 3
 * 105 10
 * 输入样例 2：
 * 9 100
 * 输出样例 2：
 * No Solution
 * @date 2022/07/20 17:20:42
 */
public class ProblemB1103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        boolean hasSolution = false;
        for (int a = m; a <= n; a++) {
            long a3 = (long) Math.pow(a, 3);
            long a3small = (long) Math.pow(a - 1, 3);
            double sqrt = Math.sqrt(a3 - a3small);
            if (sqrt % 1 == 0) {
                int sqrtInt = (int) sqrt;
                for (int i = 1; i < sqrtInt; i++) {
                    if (sqrtInt == i * i + (i - 1) * (i - 1)) {
                        hasSolution = true;
                        System.out.println(a + " " + i);
                    }
                }
            }
        }

        if (!hasSolution) {
            System.out.println("No Solution");
        }
    }
}
