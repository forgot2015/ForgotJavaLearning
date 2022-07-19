package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * 1099 性感素数
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * “性感素数”是指形如 (p, p+6) 这样的一对素数。之所以叫这个名字，是因为拉丁语管“六”叫“sex”（即英语的“性感”）。（原文摘自 http://mathworld.wolfram.com/SexyPrimes.html）
 * <p>
 * 现给定一个整数，请你判断其是否为一个性感素数。
 * <p>
 * 输入格式：
 * 输入在一行中给出一个正整数 N (≤10
 * 8
 * )。
 * <p>
 * 输出格式：
 * 若 N 是一个性感素数，则在一行中输出 Yes，并在第二行输出与 N 配对的另一个性感素数（若这样的数不唯一，输出较小的那个）。若 N 不是性感素数，则在一行中输出 No，然后在第二行输出大于 N 的最小性感素数。
 * <p>
 * 输入样例 1：
 * 47
 * 输出样例 1：
 * Yes
 * 41
 * 输入样例 2：
 * 21
 * 输出样例 2：
 * No
 * 23
 **/
public class ProblemB1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (checkIsSexPrimeNumber(n)) {
            System.out.println("Yes");
            if (checkIsSexPrimeNumber(n - 6)) {
                System.out.println(n - 6);
            } else {
                System.out.println(n + 6);
            }
        } else {
            System.out.println("No");
            while (true) {
                n++;
                if (checkIsSexPrimeNumber(n)) {
                    System.out.println(n);
                    break;
                }
            }
        }
    }

    /**
     * 检查是否属于性感素数
     **/
    private static boolean checkIsSexPrimeNumber(int x) {
        if (x < 7) {
            return (checkIsPrimeNumber(x) && checkIsPrimeNumber(x + 6));
        }
        //满足其中一条，则是性感素数
        return (checkIsPrimeNumber(x - 6) && checkIsPrimeNumber(x)) || (checkIsPrimeNumber(x) && checkIsPrimeNumber(x + 6));
    }

    /**
     * 检查是否属于素数
     **/
    private static boolean checkIsPrimeNumber(int x) {
        if (x <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(x);
        for (int i = 2; i <= sqrt; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}
