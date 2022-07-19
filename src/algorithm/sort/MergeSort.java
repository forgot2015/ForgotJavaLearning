package algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by forgot on 5/24/2017.
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 */
public class MergeSort {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String temp = null;//读取字符串
        try {
            temp = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a = Integer.parseInt(temp);//将字符串转化为int类型
    }
}
