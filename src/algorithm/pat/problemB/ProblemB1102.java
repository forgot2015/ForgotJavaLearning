package algorithm.pat.problemB;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1102 教超冠军卷
 * 分数 20
 * 作者 陈越
 * 单位 浙江大学
 * “教育超市”是拼题 A 系统的一个衍生产品，发布了各种试卷和练习供用户选购。在试卷列表中，系统不仅列出了每份试卷的单价，还显示了当前的购买人次。本题就请你根据这些信息找出教育超市所有试卷中的销量（即购买人次）冠军和销售额冠军。
 * <p>
 * 输入格式：
 * 输入首先在第一行中给出一个正整数 N（≤10
 * 4
 * ），随后 N 行，每行给出一份卷子的独特 ID （由小写字母和数字组成的、长度不超过8位的字符串）、单价（为不超过 100 的正整数）和购买人次（为不超过 10
 * 6
 * 的非负整数）。
 * <p>
 * 输出格式：
 * 在第一行中输出销量冠军的 ID 及其销量，第二行中输出销售额冠军的 ID 及其销售额。同行输出间以一个空格分隔。题目保证冠军是唯一的，不存在并列。
 * <p>
 * 输入样例：
 * 4
 * zju007 39 10
 * pku2019 9 332
 * pat2018 95 79
 * qdu106 19 38
 * 输出样例：
 * pku2019 332
 * pat2018 7505
 **/
public class ProblemB1102 {
//    public static void main(String[] args) {
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//
//        //销售量最高的卷子
//        Paper maxSalesVolumePaper = null;
//        //最高销量
//        int maxSalesVolume = 0;
//        //销售额最高的卷子
//        Paper maxSalesPaper = null;
//        //最高销售额
//        int maxSales = 0;
//        for (int i = 0; i < n; i++) {
//            Paper paper = new Paper();
//            paper.setId(scanner.next());
//            paper.setPrice(scanner.nextInt());
//            paper.setNumber(scanner.nextInt());
//
//            if (maxSalesVolumePaper == null) {
//                maxSalesVolumePaper = paper;
//                maxSalesVolume = paper.getNumber();
//            }
//            if (maxSalesPaper == null) {
//                maxSalesPaper = paper;
//                maxSales = paper.getPrice() * paper.getNumber();
//            }
//
//            if (paper.getNumber() > maxSalesVolume) {
//                maxSalesVolumePaper = paper;
//                maxSalesVolume = paper.getNumber();
//            }
//
//            if (paper.getPrice() * paper.getNumber() > maxSales) {
//                maxSalesPaper = paper;
//                maxSales = paper.getPrice() * paper.getNumber();
//            }
//        }
//
//        System.out.println(maxSalesVolumePaper.getId() + " " + maxSalesVolumePaper.getNumber());
//        System.out.print(maxSalesPaper.getId() + " " + maxSalesPaper.getPrice() * maxSalesPaper.getNumber());
//    }

    public static void main(String[] args) throws IOException {
        //解决Scanner输入时运行超时问题
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 输入
        int n = Integer.parseInt(in.readLine());

        //销售量最高的卷子
        Paper maxSalesVolumePaper = null;
        //最高销量
        int maxSalesVolume = 0;
        //销售额最高的卷子
        Paper maxSalesPaper = null;
        //最高销售额
        int maxSales = 0;
        for (int i = 0; i < n; i++) {
            String str = in.readLine();
            String[] strings = str.split(" ");
            Paper paper = new Paper();
            paper.setId(strings[0]);
            paper.setPrice(Integer.parseInt(strings[1]));
            paper.setNumber(Integer.parseInt(strings[2]));

            if (maxSalesVolumePaper == null) {
                maxSalesVolumePaper = paper;
                maxSalesVolume = paper.getNumber();
            }
            if (maxSalesPaper == null) {
                maxSalesPaper = paper;
                maxSales = paper.getPrice() * paper.getNumber();
            }

            if (paper.getNumber() > maxSalesVolume) {
                maxSalesVolumePaper = paper;
                maxSalesVolume = paper.getNumber();
            }

            if (paper.getPrice() * paper.getNumber() > maxSales) {
                maxSalesPaper = paper;
                maxSales = paper.getPrice() * paper.getNumber();
            }
        }

        System.out.println(maxSalesVolumePaper.getId() + " " + maxSalesVolumePaper.getNumber());
        System.out.print(maxSalesPaper.getId() + " " + maxSalesPaper.getPrice() * maxSalesPaper.getNumber());
    }

    private static class Paper {
        /**
         * 唯一id
         **/
        private String id;
        /**
         * 价格
         **/
        private int price;
        /**
         * 销售数量
         **/
        private int number;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
