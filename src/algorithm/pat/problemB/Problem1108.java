package algorithm.pat.problemB;

import java.util.*;

/**
 * 1108 String复读机
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * 给定一个长度不超过 10
 * 4
 * 的、仅由英文字母构成的字符串。请将字符重新调整顺序，按 StringString.... （注意区分大小写）这样的顺序输出，并忽略其它字符。当然，六种字符的个数不一定是一样多的，
 * 若某种字符已经输出完，则余下的字符仍按 String 的顺序打印，直到所有字符都被输出。例如 gnirtSSs 要调整成 StringS 输出，其中 s 是多余字符被忽略。
 * <p>
 * 输入格式：
 * 输入在一行中给出一个长度不超过 10
 * 4
 * 的、仅由英文字母构成的非空字符串。
 * <p>
 * 输出格式：
 * 在一行中按题目要求输出排序后的字符串。题目保证输出非空。
 * <p>
 * 输入样例：
 * sTRidlinSayBingStrropriiSHSiRiagIgtSSr
 * 输出样例：
 * StringStringSrigSriSiSii
 **/
public class Problem1108 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        //用来记录该值是否已打印过
//        boolean[] inputHasPrint = new boolean[input.length()];
//        Arrays.fill(inputHasPrint, false);
//        //是否存在String字符
//        boolean existString = true;
//        char lastChar = 'a';
//        while (existString) {
//            existString = false;
//            for (int i = 0, length = input.length(); i < length; i++) {
//                if (inputHasPrint[i]) {
//                    continue;
//                }
//                char c = input.charAt(i);
//                if (c == 'S' || c == 'S'+32) {
//                    existString = true;
//                    if (lastChar != 'S') {
//                        lastChar = 'S';
//                        System.out.print('S');
//                        inputHasPrint[i] = true;
//                    }
//                }
//
//                if (c == 'T' || c == 'T'+32) {
//                    existString = true;
//                    if (lastChar != 't') {
//                        lastChar = 't';
//                        System.out.print('t');
//                        inputHasPrint[i] = true;
//                    }
//                }
//
//                if (c == 'R' || c == 'R'+32) {
//                    existString = true;
//                    if (lastChar != 'r') {
//                        lastChar = 'r';
//                        System.out.print('r');
//                        inputHasPrint[i] = true;
//                    }
//                }
//
//                if (c == 'I' || c == 'I'+32) {
//                    existString = true;
//                    if (lastChar != 'i') {
//                        lastChar = 'i';
//                        System.out.print('i');
//                        inputHasPrint[i] = true;
//                    }
//                }
//
//                if (c == 'N' || c == 'N'+32) {
//                    existString = true;
//                    if (lastChar != 'n') {
//                        lastChar = 'n';
//                        System.out.print('n');
//                        inputHasPrint[i] = true;
//                    }
//                }
//
//                if (c == 'G' || c == 'G'+32) {
//                    existString = true;
//                    if (lastChar != 'g') {
//                        lastChar = 'g';
//                        System.out.print('g');
//                        inputHasPrint[i] = true;
//                    }
//                }
//            }
//        }

//        其实不用去考虑遍历顺序这些的，只需要知道String中各字符的个数就行了，然后打印即可。
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int[] letterNums = new int[150];
        for (int i = 0, length = input.length(); i < length; i++) {
            letterNums[input.charAt(i)]++;
        }

        boolean doLoop = true;
        while (doLoop) {
            if (letterNums['S'] > 0) {
                letterNums['S']--;
                System.out.print('S');
            }

            if (letterNums['t'] > 0) {
                letterNums['t']--;
                System.out.print('t');
            }

            if (letterNums['r'] > 0) {
                letterNums['r']--;
                System.out.print('r');
            }

            if (letterNums['i'] > 0) {
                letterNums['i']--;
                System.out.print('i');
            }

            if (letterNums['n'] > 0) {
                letterNums['n']--;
                System.out.print('n');
            }

            if (letterNums['g'] > 0) {
                letterNums['g']--;
                System.out.print('g');
            }

            if (letterNums['S'] == 0 && letterNums['t'] == 0 && letterNums['r'] == 0 && letterNums['i'] == 0 && letterNums['n'] == 0 && letterNums['g'] == 0) {
                doLoop = false;
            }
        }
    }
}
