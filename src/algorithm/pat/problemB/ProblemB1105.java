package algorithm.pat.problemB;

import java.util.Scanner;

/**
 * @author
 * @description 1105 链表合并
 * Score 25
 * Author 陈越
 * Organization 浙江大学
 * 给定两个单链表 L
 * 1
 * ​
 * =a
 * 1
 * ​
 * →a
 * 2
 * ​
 * →⋯→a
 * n−1
 * ​
 * →a
 * n
 * ​
 * 和 L
 * 2
 * ​
 * =b
 * 1
 * ​
 * →b
 * 2
 * ​
 * →⋯→b
 * m−1
 * ​
 * →b
 * m
 * ​
 * 。如果 n≥2m，你的任务是将比较短的那个链表逆序，然后将之并入比较长的那个链表，得到一个形如 a
 * 1
 * ​
 * →a
 * 2
 * ​
 * →b
 * m
 * ​
 * →a
 * 3
 * ​
 * →a
 * 4
 * ​
 * →b
 * m−1
 * ​
 * ⋯ 的结果。例如给定两个链表分别为 6→7 和 1→2→3→4→5，你应该输出 1→2→7→3→4→6→5。
 * <p>
 * 输入格式：
 * 输入首先在第一行中给出两个链表 L
 * 1
 * ​
 * 和 L
 * 2
 * ​
 * 的头结点的地址，以及正整数
 * N (≤10
 * 5
 * )，即给定的结点总数。一个结点的地址是一个 5 位数的非负整数，空地址 NULL 用 -1 表示。
 * <p>
 * 随后 N 行，每行按以下格式给出一个结点的信息：
 * <p>
 * Address Data Next
 * 其中 Address 是结点的地址，Data 是不超过 10
 * 5
 * 的正整数，Next 是下一个结点的地址。题目保证没有空链表，并且较长的链表至少是较短链表的两倍长。
 * <p>
 * 输出格式：
 * 按顺序输出结果链表，每个结点占一行，格式与输入相同。
 * <p>
 * 输入样例：
 * 00100 01000 7
 * 02233 2 34891
 * 00100 6 00001
 * 34891 3 10086
 * 01000 1 02233
 * 00033 5 -1
 * 10086 4 00033
 * 00001 7 -1
 * 输出样例：
 * 01000 1 02233
 * 02233 2 00001
 * 00001 7 34891
 * 34891 3 10086
 * 10086 4 00100
 * 00100 6 00033
 * 00033 5 -1
 * @date 2022/07/21 09:25:41
 */
public class ProblemB1105 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String L1Start = scanner.next();
        String L2Start = scanner.next();
        int N = scanner.nextInt();

        Node[] allNode = new Node[100000];
        int nodeIndex = 0;
        for (int i = 0; i < N; i++) {
            Node node = new Node();
            node.address = scanner.next();
            node.data = scanner.nextInt();
            node.next = scanner.next();
            allNode[nodeIndex] = node;
            nodeIndex++;
        }

        Node[] L1Node = new Node[100000];
        int L1NodeIndex = 0;
        boolean L1NodeFinsh = false;

        Node[] L2Node = new Node[100000];
        int L2NodeIndex = 0;
        boolean L2NodeFinsh = false;
        //先给开始结点赋值
        for (Node node : allNode) {
            if (L1NodeIndex > 0 && L2NodeIndex > 0) {
                break;
            }
            if (node.address.equals(L1Start)) {
                L1Node[L1NodeIndex] = node;
                L1NodeIndex++;
            }
            if (node.address.equals(L2Start)) {
                L2Node[L2NodeIndex] = node;
                L2NodeIndex++;
            }
        }

        for (int i = 0, length = allNode.length; i < length; i++) {
            for (Node node : allNode) {
                if (node.address.equals(L1Node[L1NodeIndex - 1].next)) {
                    L1Node[L1NodeIndex] = node;
                    L1NodeIndex++;
                }

                if (node.address.equals(L2Node[L2NodeIndex - 1].next)) {
                    L2Node[L2NodeIndex] = node;
                    L2NodeIndex++;
                }
            }
        }

        if (L1Node.length>=2*L2Node.length){

        }

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
