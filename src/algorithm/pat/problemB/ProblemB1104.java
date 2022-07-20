package algorithm.pat.problemB;

import java.util.*;

/**
 * 1104 天长地久
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * “天长地久数”是指一个 K 位正整数 A，其满足条件为：A 的各位数字之和为 m，A+1 的各位数字之和为 n，且 m 与 n 的最大公约数是一个大于 2 的素数。本题就请你找出这些天长地久数。
 * <p>
 * 输入格式：
 * 输入在第一行给出正整数 N（≤5），随后 N 行，每行给出一对 K（3<K<10）和 m（1<m<90），其含义如题面所述。
 * <p>
 * 输出格式：
 * 对每一对输入的 K 和 m，首先在一行中输出 Case X，其中 X 是输出的编号（从 1 开始）；然后一行输出对应的 n 和 A，数字间以空格分隔。如果解不唯一，则每组解占一行，按 n 的递增序输出；若仍不唯一，则按 A 的递增序输出。若解不存在，则在一行中输出 No Solution。
 * <p>
 * 输入样例：
 * 2
 * 6 45
 * 7 80
 * 输出样例：
 * Case 1
 * 10 189999
 * 10 279999
 * 10 369999
 * 10 459999
 * 10 549999
 * 10 639999
 * 10 729999
 * 10 819999
 * 10 909999
 * Case 2
 * No Solution
 **/
public class ProblemB1104 {
    /**
     * * 注意关于测试点2，要排序再输出
     * * 如果解不唯一，则每组解占一行，按 n 的递增序输出；若仍不唯一，则按 A 的递增序输出。
     **/
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        for (int i = 0; i < N; i++) {
//            System.out.println("Case " + (i + 1));
//
//            int K = scanner.nextInt();
//            int m = scanner.nextInt();
//
//            int AStart = (int) Math.pow(10, K - 1) + 9;
//            int AEnd = (int) Math.pow(10, K) - 1;
//
//            boolean hasSolution = false;
//
//            //K最少4位，结尾应该是9，否则相加之后不符合情况，则步进为10即可，保证位数是9
//            for (int j = AStart; j < AEnd; j += 10) {
//                //计算j各位数之和
//                int mTemp = getAllDigitSum(j);
//
//                if (mTemp == m) {
//                    int jPlus = j + 1;
//                    int n = getAllDigitSum(jPlus);
//
//                    int commonDivisor = getMaxCommonDivisor(m, n);
//                    if (commonDivisor > 2 && checkIsPrime(commonDivisor)) {
//                        hasSolution = true;
//
//                        System.out.println(n + " " + j);
//                    }
//                }
//            }
//            if (!hasSolution) {
//                System.out.println("No Solution");
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Case " + (i + 1));

            int K = scanner.nextInt();
            int m = scanner.nextInt();

            int AStart = (int) Math.pow(10, K - 1) + 9;
            int AEnd = (int) Math.pow(10, K) - 1;

            boolean hasSolution = false;

            List<Bean> beanList = new ArrayList<>();

            //K最少4位，结尾应该是9，否则相加之后不符合情况，则步进为10即可，保证位数是9
            for (int j = AStart; j < AEnd; j += 10) {
                //计算j各位数之和
                int mTemp = getAllDigitSum(j);

                if (mTemp == m) {
                    int jPlus = j + 1;
                    int n = getAllDigitSum(jPlus);

                    int commonDivisor = getMaxCommonDivisor(m, n);
                    if (commonDivisor > 2 && checkIsPrime(commonDivisor)) {
                        hasSolution = true;
                        beanList.add(new Bean(n, j));
//                        System.out.println(n + " " + j);
                    }
                }
            }
            if (!hasSolution) {
                System.out.println("No Solution");
            } else {
                Comparator<Bean> comparator = (o1, o2) -> {
                    if (o2.nSort < o1.nSort) {
                        //返回1代表要更换排序，也就是o1>o2的话要换排序，说明这是从小到大排
                        return 1;
                    } else if (o2.nSort > o1.nSort) {
                        return -1;
                    } else {
                        return 0;
                    }
                };
                beanList.sort(comparator);

                for (Bean bean : beanList) {
                    System.out.println(bean.nSort + " " + bean.ASort);
                }
            }
        }
    }

    /**
     * 获取某数各位之和
     **/
    private static int getAllDigitSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    /**
     * 求m和n的最大公约数
     * 即 gcd 最大公约数 (greatest common divisor)
     **/
    private static int getMaxCommonDivisor(int m, int n) {
        int max = Math.max(m, n);
        int min = Math.min(m, n);

        //辗转相除法求最大公约数
        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

//        System.out.println(String.format("%d 和 %d 的最大公约数是 %d", m, n, maxCommon));
        return min;
    }

    /**
     * 判断是否素数
     **/
    private static boolean checkIsPrime(int num) {
        if (num == 1) {
            return false;
        }

        //注意这里是i <= sqrt ， 可以等于
        for (int i = 2, sqrt = (int) Math.sqrt(num); i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static class Bean {
        private int nSort;
        private int ASort;

        public Bean(int nSort, int ASort) {
            this.nSort = nSort;
            this.ASort = ASort;
        }
    }
}
