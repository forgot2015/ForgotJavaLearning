package algorithm.pat.problemB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @description 1100 校庆
 *              Score 25
 *              Author 陈越
 *              Organization 浙江大学
 *              2019 年浙江大学将要庆祝成立 122
 *              周年。为了准备校庆，校友会收集了所有校友的身份证号。现在需要请你编写程序，根据来参加校庆的所有人士的身份证号，统计来了多少校友。
 * 
 *              输入格式：
 *              输入在第一行给出不超过 10
 *              5
 *              的正整数 N，随后 N 行，每行给出一位校友的身份证号（18 位由数字和大写字母X组成的字符串）。题目保证身份证号不重复。
 * 
 *              随后给出前来参加校庆的所有人士的信息：首先是一个不超过 10
 *              5
 *              的正整数 M，随后 M 行，每行给出一位人士的身份证号。题目保证身份证号不重复。
 * 
 *              输出格式：
 *              首先在第一行输出参加校庆的校友的人数。然后在第二行输出最年长的校友的身份证号 —— 注意身份证第 7-14 位给出的是
 *              yyyymmdd 格式的生日。如果没有校友来，则在第二行输出最年长的来宾的身份证号。题目保证这样的校友或来宾必是唯一的。
 * 
 *              输入样例：
 *              5
 *              372928196906118710
 *              610481197806202213
 *              440684198612150417
 *              13072819571002001X
 *              150702193604190912
 *              6
 *              530125197901260019
 *              150702193604190912
 *              220221196701020034
 *              610481197806202213
 *              440684198612150417
 *              370205198709275042
 *              输出样例：
 *              3
 *              150702193604190912
 * @author jingwang36
 * @date 2022/07/20 15:10:58
 */

public class ProblemB1100 {

  // 方法一 用 Scanner 会超时,用 BufferedReader 会超内存?
  // public static void main(String[] args) throws IOException {
  // // Scanner scanner = new Scanner(System.in);
  // // int n = scanner.nextInt();
  // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  // int n = Integer.parseInt(in.readLine());
  // String[] nCards = new String[n];
  // for (int i = 0; i < n; i++) {
  // nCards[i] = in.readLine();
  // }

  // int m = Integer.parseInt(in.readLine());
  // String[] mComeCards = new String[m];
  // for (int i = 0; i < m; i++) {
  // mComeCards[i] = in.readLine();
  // }

  // int comeCount = 0;
  // // 年纪最大的来宾
  // String oldestCard = "";
  // int oldestCardDate = 99999999;
  // // 年纪最大的校友
  // String oldestFellowCard = "";
  // int oldestFellowCardDate = 99999999;
  // for (int i = 0, nLength = nCards.length; i < nLength; i++) {
  // for (int j = 0, mLength = mComeCards.length; j < mLength; j++) {
  // String date = mComeCards[j].substring(6, 13);
  // int dateInt = Integer.parseInt(date);
  // if (dateInt < oldestCardDate) {
  // oldestCardDate = dateInt;
  // oldestCard = mComeCards[j];
  // }
  // if (mComeCards[j].equals(nCards[i])) {
  // // System.out.println("comeCount++");
  // comeCount++;
  // if (dateInt < oldestFellowCardDate) {
  // oldestFellowCardDate = dateInt;
  // oldestFellowCard = mComeCards[j];
  // }
  // }
  // }
  // }

  // System.out.println(comeCount);
  // if (oldestFellowCard.isEmpty()) {
  // System.out.println(oldestCard);
  // } else {
  // System.out.println(oldestFellowCard);
  // }
  // }

  // 方法二,减少一层循环, 但还是超内存
  // public static void main(String[] args) throws IOException {
  // // Scanner scanner = new Scanner(System.in);
  // // int n = scanner.nextInt();
  // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  // int n = Integer.parseInt(in.readLine());
  // String[] nCards = new String[n];
  // for (int i = 0; i < n; i++) {
  // nCards[i] = in.readLine();
  // }

  // // 来宾数量
  // int comeCount = 0;
  // // 年纪最大的来宾
  // String oldestCard = "";
  // int oldestCardDate = 99999999;
  // // 年纪最大的校友
  // String oldestFellowCard = "";
  // int oldestFellowCardDate = 99999999;

  // int m = Integer.parseInt(in.readLine());
  // String mComeCard;
  // for (int j = 0; j < m; j++) {
  // mComeCard = in.readLine();
  // String date = mComeCard.substring(6, 13);
  // int dateInt = Integer.parseInt(date);
  // if (dateInt < oldestCardDate) {
  // oldestCardDate = dateInt;
  // oldestCard = mComeCard;
  // }
  // for (int i = 0, nLength = nCards.length; i < nLength; i++) {
  // if (mComeCard.equals(nCards[i])) {
  // // System.out.println("comeCount++");
  // comeCount++;
  // if (dateInt < oldestFellowCardDate) {
  // oldestFellowCardDate = dateInt;
  // oldestFellowCard = mComeCard;
  // }
  // }

  // }
  // }

  // System.out.println(comeCount);
  // if (oldestFellowCard.isEmpty()) {
  // System.out.println(oldestCard);
  // } else {
  // System.out.println(oldestFellowCard);
  // }
  // }

  // 方法三, 用 HashSet 来实现
  public static void main(String[] args) throws IOException {
    // Scanner scanner = new Scanner(System.in);
    // int n = scanner.nextInt();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());

    HashSet<String> hashSet = new HashSet<>();
    for (int i = 0; i < n; i++) {
      hashSet.add(in.readLine());
    }

    // 来宾数量
    int comeCount = 0;
    // 年纪最大的来宾
    String oldestCard = "";
    int oldestCardDate = 99999999;
    // 年纪最大的校友
    String oldestFellowCard = "";
    int oldestFellowCardDate = 99999999;

    int m = Integer.parseInt(in.readLine());
    String mComeCard;
    for (int j = 0; j < m; j++) {
      mComeCard = in.readLine();

      String date = mComeCard.substring(6, 13);
      int dateInt = Integer.parseInt(date);
      if (dateInt < oldestCardDate) {
        oldestCardDate = dateInt;
        oldestCard = mComeCard;
      }

      if (hashSet.contains(mComeCard)) {
        comeCount++;
        if (dateInt < oldestFellowCardDate) {
          oldestFellowCardDate = dateInt;
          oldestFellowCard = mComeCard;
        }
      }
    }

    System.out.println(comeCount);
    if (oldestFellowCard.isEmpty()) {
      System.out.println(oldestCard);
    } else {
      System.out.println(oldestFellowCard);
    }
  }

}
