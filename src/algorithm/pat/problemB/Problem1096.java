package algorithm.pat.problemB;


import java.util.Scanner;

/**
 * 1096 大美数
 * 分数 15
 * 作者 陈越
 * 单位 浙江大学
 * 若正整数 N 可以整除它的 4 个不同正因数之和，则称这样的正整数为“大美数”。本题就要求你判断任一给定的正整数是否是“大美数”。
 * <p>
 * 输入格式：
 * 输入在第一行中给出正整数 K（≤10），随后一行给出 K 个待检测的、不超过 10
 * 4
 * 的正整数。
 * <p>
 * 输出格式：
 * 对每个需要检测的数字，如果它是大美数就在一行中输出 Yes，否则输出 No。
 * <p>
 * 输入样例：
 * 3
 * 18 29 40
 * 输出样例：
 * Yes
 * No
 * Yes
 **/
public class Problem1096 {

    /**
     * 1. 注意a可以整除b指的是b%a == 0，不要搞反了
     * <p>
     * 2. 测试点3是因子中是否有重复的，比如25=5*5，重复了因子5，所以添加因子的时候要注意有没有重复的因子。
     * <p>
     * 3. 这题给的数据量较小，用四重循环竟然都不会超时（很符合15分题目的限制），下面给出循环和dfs两种代码，大家自行参考。
     * ————————————————
     * 版权声明：本文为CSDN博主「噗噗桐桐」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/weixin_46389356/article/details/124283356
     **/
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (checkNum(num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean checkNum(int num) {
        int[] divisor = new int[100];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            //计算正因子
            if (num % i == 0) {
                divisor[index] = i;
                index++;
            }
        }

        //若因子数量不足4，则直接返回false
        if (index < 4) {
            return false;
        }

        //四重循环
        for (int i = 0; i < index - 3; i++) {
            for (int j = i + 1; j < index - 2; j++) {
                for (int k = i + 2; k < index - 1; k++) {
                    for (int l = i + 3; l < index; l++) {
                        int sum = divisor[i] + divisor[j] + divisor[k] + divisor[l];
                        //谁除谁：应该是（四个数的和）/（正整数 N）
                        if (sum % num == 0) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

}
