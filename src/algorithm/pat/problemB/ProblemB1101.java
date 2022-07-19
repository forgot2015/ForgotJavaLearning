package algorithm.pat.problemB;


import java.util.Scanner;

/**
 * 1101 B是A的多少倍
 * 设一个数 A 的最低 D 位形成的数是 a
 * d
 * ​
 * 。如果把 a
 * d
 * ​
 * 截下来移到 A 的最高位前面，就形成了一个新的数 B。B 是 A 的多少倍？例如将 12345 的最低 2 位 45 截下来放到 123 的前面，就得到 45123，它约是 12345 的 3.66 倍。
 * <p>
 * 输入格式：
 * 输入在一行中给出一个正整数 A（≤10
 * 9
 * ）和要截取的位数 D。题目保证 D 不超过 A 的总位数。
 * <p>
 * 输出格式：
 * 计算 B 是 A 的多少倍，输出小数点后 2 位。
 * <p>
 * 输入样例 1：
 * 12345 2
 * 输出样例 1：
 * 3.66
 * 输入样例 2：
 * 12345 5
 * 输出样例 2：
 * 1.00
 **/
public class ProblemB1101 {

//    法1，字符串拼接法
    public static void main(String[] args) {
        int a, d;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        d = scanner.nextInt();
        String aStr = String.valueOf(a);

        String ad = aStr.substring(aStr.length() - d);
        String aStrFront = aStr.substring(0, aStr.length() - d);
        String aStrAfter = ad + aStrFront;
        long aAfter = Long.parseLong(aStrAfter);
        System.out.println(String.format("%.2f", (double) aAfter / a));
    }

//    法2， 数值计算法
}
