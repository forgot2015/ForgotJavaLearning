package algorithm.pat.problemB;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        //获取字符串
//        String str = scanner.next();
//        //获取整数
//        int i = scanner.nextInt();
//
//        //解决Scanner输入时运行超时问题
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 输入
//        int n = Integer.parseInt(in.readLine());
//        String string = in.readLine();
//        String[] strings = str.split(" ");

        int[] ints = new int[10];
        System.out.println(ints[5]);

        String[] strings = new String[10];
        System.out.println(strings[5]);
    }

    /**
     * 结点
     **/
    private static class Node {
        // 当前结点地址
        String address;
        // 当前结点数据
        int data;
        // 下一个结点地址
        String next;
    }
}
