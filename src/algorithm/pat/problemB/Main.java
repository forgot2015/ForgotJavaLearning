package algorithm.pat.problemB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        //获取字符串
        String str = scanner.next();
        //获取整数
        int i = scanner.nextInt();

        //解决Scanner输入时运行超时问题
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 输入
        int n = Integer.parseInt(in.readLine());
        String string = in.readLine();
        String[] strings = str.split(" ");
    }
}
