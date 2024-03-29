package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * 1002 写出这个数
 * 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * <p>
 * 输入格式：
 * 每个测试输入包含 1 个测试用例，即给出自然数 n 的值。这里保证 n 小于 10^100
 * 。
 * <p>
 * 输出格式：
 * 在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
 * <p>
 * 输入样例：
 * 1234567890987654321123456789
 * 输出样例：
 * yi san wu
 **/
public class ProblemB1002 {
    public static void main(String[] args) {
        String[] out = new String[]{"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int sum = 0;
        for (int i = 0, length = input.length(); i < length; i++) {
            sum += input.charAt(i) - '0';
        }
        String sumStr = String.valueOf(sum);
        for (int i = 0, length = sumStr.length(); i < length; i++) {
            int index = sumStr.charAt(i) - '0';
            System.out.print(out[index]);
            if (i != length - 1) {
                System.out.print(" ");
            }
        }
    }
}
