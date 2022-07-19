package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * 1106 2019数列
 * 分数 15
 * 作者 陈越
 * 单位 浙江大学
 * 把 2019 各个数位上的数字 2、0、1、9 作为一个数列的前 4 项，用它们去构造一个无穷数列，其中第 n（>4）项是它前 4 项之和的个位数字。例如第 5 项为 2， 因为 2+0+1+9=12，个位数是 2。
 * <p>
 * 本题就请你编写程序，列出这个序列的前 n 项。
 * <p>
 * 输入格式：
 * 输入给出正整数 n（≤1000）。
 * <p>
 * 输出格式：
 * 在一行中输出数列的前 n 项，数字间不要有空格。
 * <p>
 * 输入样例：
 * 10
 * 输出样例：
 * 2019224758
 * 题外话：这个数列中永远不会出现 2018，你能证明吗？
 **/
public class ProblemB1106 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int[] arr = new int[1000];
        arr[0] = 2;
        arr[1] = 0;
        arr[2] = 1;
        arr[3] = 9;

        if (n >4) {
            //当n大于4时，才要去计算后续的值
            for (int i = 4; i < n; i++) {
                arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4]) % 10;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
