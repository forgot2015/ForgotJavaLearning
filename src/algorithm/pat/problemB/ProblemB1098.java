package algorithm.pat.problemB;


import java.util.Scanner;

/**
 * 1098 岩洞施工
 * 要将一条直径至少为 1 个单位的长管道水平送入地形复杂的岩洞中，究竟是否可能？下面的两幅图分别给出了岩洞的剖面图，深蓝色的折线勾勒出岩洞顶部和底部的轮廓。图 1 是有可能的，绿色部分显示直径为 1 的管道可以送入。图 2 就不可能，除非把顶部或底部的突出部分削掉 1 个单位的高度。
 * <p>
 * fig.JPG
 * <p>
 * 本题就请你编写程序，判断给定的岩洞中是否可以施工。
 * <p>
 * 输入格式：
 * 输入在第一行给出一个不超过 100 的正整数 N，即横向采样的点数。随后两行数据，从左到右顺次给出采样点的纵坐标：第 1 行是岩洞顶部的采样点，第 2 行是岩洞底部的采样点。这里假设坐标原点在左下角，每个纵坐标为不超过 1000 的非负整数。同行数字间以空格分隔。
 * <p>
 * 题目保证输入数据是合理的，即岩洞底部的轮廓线不会与顶部轮廓线交叉。
 * <p>
 * 输出格式：
 * 如果可以直接施工，则在一行中输出 Yes 和可以送入的管道的最大直径；如果不行，则输出 No 和至少需要削掉的高度。答案和数字间以 1 个空格分隔。
 * <p>
 * 输入样例 1：
 * 11
 * 7 6 5 5 6 5 4 5 5 4 4
 * 3 2 2 2 2 3 3 2 1 2 3
 * 输出样例 1：
 * Yes 1
 * 输入样例 2：
 * 11
 * 7 6 5 5 6 5 4 5 5 4 4
 * 3 2 2 2 3 4 3 2 1 2 3
 * 输出样例 2：
 * No 1
 **/
public class ProblemB1098 {
    public static void main(String[] args) {
        int n;
        int topMin = 1000;
        int bottomMax = 0;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            //取上部最小值
            int input = scanner.nextInt();
            if (input < topMin) {
                topMin = input;
            }
        }
        for (int i = 0; i < n; i++) {
            //取下部最大值
            int input2 = scanner.nextInt();
            if (input2 > bottomMax) {
                bottomMax = input2;
            }
        }

        if (topMin - bottomMax >= 1) {
            //至少要通过一个单位
            System.out.println("Yes " + (topMin - bottomMax));
        } else {
            //至少要通过一个单位，最终最终要+1
            System.out.println("No " + (bottomMax - topMin + 1));
        }
    }
}
