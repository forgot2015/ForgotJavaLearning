package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * 1097 矩阵行平移
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * 给定一个 n×n 的整数矩阵。对任一给定的正整数 k<n，我们将矩阵的奇数行的元素整体向右依次平移 1、……、k、1、……、k、…… 个位置，平移空出的位置用整数 x 补。你需要计算出结果矩阵的每一列元素的和。
 * <p>
 * 输入格式：
 * 输入第一行给出 3 个正整数：n（<100）、k（<n）、x（<100），分别如题面所述。
 * <p>
 * 接下来 n 行，每行给出 n 个不超过 100 的正整数，为矩阵元素的值。数字间以空格分隔。
 * <p>
 * 输出格式：
 * 在一行中输出平移后第 1 到 n 列元素的和。数字间以 1 个空格分隔，行首尾不得有多余空格。
 * <p>
 * 输入样例：
 * 7 2 99
 * 11 87 23 67 20 75 89
 * 37 94 27 91 63 50 11
 * 44 38 50 26 40 26 24
 * 73 85 63 28 62 18 68
 * 15 83 27 97 88 25 43
 * 23 78 98 20 30 81 99
 * 77 36 48 59 25 34 22
 * 输出样例：
 * 529 481 479 263 417 342 343
 * 样例解读
 * <p>
 * 需要平移的是第 1、3、5、7 行。给定 k=2，应该将这三列顺次整体向右平移 1、2、1、2 位（如果有更多行，就应该按照 1、2、1、2、1、2 …… 这个规律顺次向右平移），左端的空位用 99 来填充。平移后的矩阵变成：
 * <p>
 * 99 11 87 23 67 20 75
 * 37 94 27 91 63 50 11
 * 99 99 44 38 50 26 40
 * 73 85 63 28 62 18 68
 * 99 15 83 27 97 88 25
 * 23 78 98 20 30 81 99
 * 99 99 77 36 48 59 25
 **/
public class ProblemB1097 {
    public static void main(String[] args) {
        int n, k, x;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        x = scanner.nextInt();

        int[][] matrix = new int[n][n];
        //接收输入的矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //记录要移一位还是k位
        boolean moveOne = true;
        for (int i = 0; i < n; i++) {
            //i + 1 代表第几行，如i=0，其实是第一行
            if ((i + 1) % 2 == 1) {
                //单数的才要右移
                //右移1
                if (moveOne) {
                    for (int j = n - 1; j > 0; j--) {
                        matrix[i][j] = matrix[i][j - 1];

                    }
                    matrix[i][0] = x;
                } else {
                    //右移k
                    for (int j = n - 1; j >= k; j--) {
                        matrix[i][j] = matrix[i][j - k];
                    }
                    for (int j = 0; j < k; j++) {
                        matrix[i][j] = x;
                    }
                }
                moveOne = !moveOne;
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[j][i];
            }
            System.out.print(sum);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }

    }
}
