package algorithm.pat.problemB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author
 * @description 1109 擅长C
 * Score 20
 * Author 陈越
 * Organization 浙江大学
 * 当你被面试官要求用 C 写一个“Hello World”时，有本事像下图显示的那样写一个出来吗？
 * <p>
 * HWC.jpg
 * <p>
 * 输入格式：
 * 输入首先给出 26 个英文大写字母 A-Z，每个字母用一个 7×5 的、由 C 和 .
 * 组成的矩阵构成。最后在一行中给出一个句子，以回车结束。句子是由若干个单词（每个包含不超过 10
 * 个连续的大写英文字母）组成的，单词间以任何非大写英文字母分隔。
 * <p>
 * 题目保证至少给出一个单词。
 * <p>
 * 输出格式：
 * 对每个单词，将其每个字母用矩阵形式在一行中输出，字母间有一列空格分隔。单词的首尾不得有多余空格。
 * <p>
 * 相邻的两个单词间必须有一空行分隔。输出的首尾不得有多余空行。
 * <p>
 * 输入样例：
 * ..C..
 * .C.C.
 * C...C
 * CCCCC
 * C...C
 * C...C
 * C...C
 * CCCC.
 * C...C
 * C...C
 * CCCC.
 * C...C
 * C...C
 * CCCC.
 * .CCC.
 * C...C
 * C....
 * C....
 * C....
 * C...C
 * .CCC.
 * CCCC.
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * CCCC.
 * CCCCC
 * C....
 * C....
 * CCCC.
 * C....
 * C....
 * CCCCC
 * CCCCC
 * C....
 * C....
 * CCCC.
 * C....
 * C....
 * C....
 * CCCC.
 * C...C
 * C....
 * C.CCC
 * C...C
 * C...C
 * CCCC.
 * C...C
 * C...C
 * C...C
 * CCCCC
 * C...C
 * C...C
 * C...C
 * CCCCC
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * CCCCC
 * CCCCC
 * ....C
 * ....C
 * ....C
 * ....C
 * C...C
 * .CCC.
 * C...C
 * C..C.
 * C.C..
 * CC...
 * C.C..
 * C..C.
 * C...C
 * C....
 * C....
 * C....
 * C....
 * C....
 * C....
 * CCCCC
 * C...C
 * C...C
 * CC.CC
 * C.C.C
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * CC..C
 * C.C.C
 * C..CC
 * C...C
 * C...C
 * .CCC.
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * .CCC.
 * CCCC.
 * C...C
 * C...C
 * CCCC.
 * C....
 * C....
 * C....
 * .CCC.
 * C...C
 * C...C
 * C...C
 * C.C.C
 * C..CC
 * .CCC.
 * CCCC.
 * C...C
 * CCCC.
 * CC...
 * C.C..
 * C..C.
 * C...C
 * .CCC.
 * C...C
 * C....
 * .CCC.
 * ....C
 * C...C
 * .CCC.
 * CCCCC
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * .CCC.
 * C...C
 * C...C
 * C...C
 * C...C
 * C...C
 * .C.C.
 * ..C..
 * C...C
 * C...C
 * C...C
 * C.C.C
 * CC.CC
 * C...C
 * C...C
 * C...C
 * C...C
 * .C.C.
 * ..C..
 * .C.C.
 * C...C
 * C...C
 * C...C
 * C...C
 * .C.C.
 * ..C..
 * ..C..
 * ..C..
 * ..C..
 * CCCCC
 * ....C
 * ...C.
 * ..C..
 * .C...
 * C....
 * CCCCC
 * HELLO~WORLD!
 * 输出样例：
 * C...C CCCCC C.... C.... .CCC.
 * C...C C.... C.... C.... C...C
 * C...C C.... C.... C.... C...C
 * CCCCC CCCC. C.... C.... C...C
 * C...C C.... C.... C.... C...C
 * C...C C.... C.... C.... C...C
 * C...C CCCCC CCCCC CCCCC .CCC.
 * <p>
 * C...C .CCC. CCCC. C.... CCCC.
 * C...C C...C C...C C.... C...C
 * C...C C...C CCCC. C.... C...C
 * C.C.C C...C CC... C.... C...C
 * CC.CC C...C C.C.. C.... C...C
 * C...C C...C C..C. C.... C...C
 * C...C .CCC. C...C CCCCC CCCC.
 * @date 2022/07/21 14:33:11
 */
public class ProblemB1109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String[]> letterMap = new HashMap<>();

        int curLetter = 'A';
        // 循环 26 次,录入 26 个字母的字符串表
        for (int i = 0; i < 26; i++) {
            String[] strings = new String[7];
            strings[0] = scanner.nextLine();
            strings[1] = scanner.nextLine();
            strings[2] = scanner.nextLine();
            strings[3] = scanner.nextLine();
            strings[4] = scanner.nextLine();
            strings[5] = scanner.nextLine();
            strings[6] = scanner.nextLine();
            letterMap.put(curLetter, strings);
            curLetter++;
        }

        // String[] words = new String[10];
        List<String> wordList = new ArrayList<>();

        String wordStr = scanner.nextLine();
        // 下一个单词的首字母索引
        int startIndex = 0;
        // 是否已经找到了开始字母,有的话则下一个要找结束字母
        boolean hasFindStart = false;
        // for (int i = 0; i < wordStr.length(); i++) {
        // char c = wordStr.charAt(i);
        // if (c < 'A' || c > 'Z') {
        // String word = wordStr.substring(startIndex, i);
        // wordList.add(word);
        // startIndex = i + 1;
        // }
        // }

        // 解析要输出的单词列表
        for (int i = 0; i < wordStr.length(); i++) {
            char c = wordStr.charAt(i);
            if (isInAZ(c)) {
                // 字符在 A-Z之间
                if (!hasFindStart) {
                    hasFindStart = true;
                    startIndex = i;
                }

                if (i == wordStr.length() - 1) {
                    // 若是最后一个字母,则也是一个单词了
                    String word = wordStr.substring(startIndex);
                    wordList.add(word);
                    hasFindStart = false;
                }
            } else {
                // 不在 A-Z之间时, 若还没有找到首个大写字母,则忽略
                if (hasFindStart) {
                    String word = wordStr.substring(startIndex, i);
                    wordList.add(word);
                    hasFindStart = false;
                    // startIndex = i + 1;
                }
            }
        }

        // 打印测试下字母表接收结果
        // System.out.println("------------------------------------------");
        // for (Map.Entry<Integer, String[]> entry : letterMap.entrySet()) {
        // System.out.println(entry.getKey());
        // // System.out.println(Arrays.toString(entry.getValue()));
        // String[] strings = entry.getValue();
        // for (int j = 0; j < strings.length; j++) {
        // System.out.println(strings[j]);
        // }
        // }

        for (int i = 0; i < wordList.size(); i++) {
            // System.out.println(wordList.get(i));
            if (i != 0) {
                // 若不是第一个单词, 则打印一行空格
                System.out.println();
            }
            printWord(wordList.get(i), letterMap);

        }
    }

    // 判断字母是否在 A-Z之间
    private static boolean isInAZ(char c) {
        return c >= 'A' && c <= 'Z';
    }

    // 打印单词, 题意说每个单词不超过 10 个字母
    private static void printWord(String word, Map<Integer, String[]> letterMap) {
        // 每个字母要打印七行字符
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < word.length(); j++) {
                // 打印第 j 的字符的第 i 行
                char c = word.charAt(j);
                if (j != 0) {
                    // 若不是首个字母,则先打印一个空格
                    System.out.print(" ");
                }

                System.out.print(letterMap.get((int) c)[i]);
            }
            System.out.println();
        }
    }
}
