package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * 1107 老鼠爱大米
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * 翁恺老师曾经设计过一款 Java 挑战游戏，叫“老鼠爱大米”（或许因为他的外号叫“胖胖鼠”）。每个玩家用 Java 代码控制一只鼠，目标是抢吃尽可能多的大米让自己变成胖胖鼠，最胖的那只就是冠军。
 * <p>
 * 因为游戏时间不能太长，我们把玩家分成 N 组，每组 M 只老鼠同场竞技，然后从 N 个分组冠军中直接选出最胖的冠军胖胖鼠。现在就请你写个程序来得到冠军的体重。
 * <p>
 * 输入格式：
 * 输入在第一行中给出 2 个正整数：N（≤100）为组数，M（≤10）为每组玩家个数。随后 N 行，每行给出一组玩家控制的 M 只老鼠最后的体重，均为不超过 10
 * 4
 * 的非负整数。数字间以空格分隔。
 * <p>
 * 输出格式：
 * 首先在第一行顺次输出各组冠军的体重，数字间以 1 个空格分隔，行首尾不得有多余空格。随后在第二行输出冠军胖胖鼠的体重。
 * <p>
 * 输入样例：
 * 3 5
 * 62 53 88 72 81
 * 12 31 9 0 2
 * 91 42 39 6 48
 * 输出样例：
 * 88 31 91
 * 91
 **/
public class ProblemB1107 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int totalMax = 0;
        for (int i = 0; i < n; i++) {
            int curMax = 0;
            for (int j = 0; j < m; j++) {
                int curNum = scanner.nextInt();
                if (curNum > curMax) {
                    curMax = curNum;
                }
            }
            System.out.print(curMax);
            if (i != n - 1) {
                System.out.print(" ");
            }
            if (curMax > totalMax) {
                totalMax = curMax;
            }
        }
        System.out.println();
        System.out.print(totalMax);
    }
}
