package algorithm.pat.problemB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author
 * @description 1110 区块反转
 * Score 25
 * Author 陈越
 * Organization 浙江大学
 * 给定一个单链表 L，我们将每 K 个结点看成一个区块（链表最后若不足 K 个结点，也看成一个区块），请编写程序将 L
 * 中所有区块的链接反转。例如：给定 L 为 1→2→3→4→5→6→7→8，K 为 3，则输出应该为
 * 7→8→4→5→6→1→2→3。
 * <p>
 * 输入格式：
 * 每个输入包含 1 个测试用例。每个测试用例第 1 行给出第 1 个结点的地址、结点总个数正整数 N (≤10
 * 5
 * )、以及正整数 K (≤N)，即区块的大小。结点的地址是 5 位非负整数，NULL 地址用 −1 表示。
 * <p>
 * 接下来有 N 行，每行格式为：
 * <p>
 * Address Data Next
 * 其中 Address 是结点地址，Data 是该结点保存的整数数据，Next 是下一结点的地址。
 * <p>
 * 输出格式：
 * 对每个测试用例，顺序输出反转后的链表，其上每个结点占一行，格式与输入相同。
 * <p>
 * 输入样例：
 * 00100 8 3
 * 71120 7 88666
 * 00000 4 99999
 * 00100 1 12309
 * 68237 6 71120
 * 33218 3 00000
 * 99999 5 68237
 * 88666 8 -1
 * 12309 2 33218
 * 输出样例：
 * 71120 7 88666
 * 88666 8 00000
 * 00000 4 99999
 * 99999 5 68237
 * 68237 6 00100
 * 00100 1 12309
 * 12309 2 33218
 * 33218 3 -1
 * @date 2022/07/21 09:26:41
 */
public class ProblemB1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String startAddr = scanner.next();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Node> list = new ArrayList<>();
        // 导入结点数据
        for (int i = 0; i < N; i++) {
            Node node = new Node();
            node.address = scanner.next();
            node.data = scanner.nextInt();
            node.next = scanner.next();
            list.add(node);
        }

        // 结点排序
//        Comparator<Node> comparator = Comparator.comparingInt(o -> o.data);
//        Comparator<Node> comparator = new Comparator<Node>() {
//            @Override
//            public int compare(Node o1, Node o2) {
//                if ( o1.data>o2.data ) {
//                    return 1;
//                } else if (o1.data < o2.data) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        };
//        list.sort(comparator);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).address.equals(startAddr)) {
                Node start = list.get(i);
                list.remove(i);
                list.add(0, start);
            }
        }

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).next.equals(list.get(j).address)) {
                    Node temp = list.get(i+1);
                    list.set(i+1,list.get(j));
                    list.set(j,temp);
                    break;
                }
            }
        }

        //计算总的区块数
        int block = (N + K - 1) / K;
        //遍历区块数
        for (int i = 0; i < block; i++) {
            //该区块的起点
            int blockStartIndex = (block - i - 1) * K;
            //遍历某区块下的第j个
            for (int j = 0; j < K && j + blockStartIndex < N; j++) {
                if (i != 0 || j != 0) {
                    //除第一个以外，上一个数据中的next必是这一个数据的address
                    System.out.println(list.get(j + blockStartIndex).address);
                }
                //打印address和data
                System.out.print(list.get(j + blockStartIndex).address + " " + list.get(j + blockStartIndex).data + " ");
            }
        }
        //打印最后一个-1
        System.out.print("-1");
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
