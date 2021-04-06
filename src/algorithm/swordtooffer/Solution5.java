package algorithm.swordoffer;

import java.util.Stack;

/**
 * Created by forgot on 5/24/2017.
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

/*用两个栈实现一个队列的功能?要求给出算法和思路!
<分析>：
入队：将元素进栈A
出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
 如果不为空，栈B直接出栈。
用两个队列实现一个栈的功能?要求给出算法和思路!
<分析>：
入栈：将元素进队列A

出栈：判断队列A中元素的个数是否为1，如果等于1，则出队列，否则将队列A中的元素   以此出队列并放入队列B，直到队列A中的元素留下一个，然后队列A出队列，再把   队列B中的元素出队列以此放入队列A中。
*/
public class Solution5 {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        pop();
        System.out.println("stack2.size():" + stack2.size());
        for (int i = 0; i < stack2.size(); i++) {
            System.out.println(stack2.size());
            System.out.println(stack2.pop());
            System.out.println("stack2.get(" + i + ")" + stack2.get(i));
        }
    }

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {
        if (stack1.empty() && stack2.empty()) {
            throw new RuntimeException("Queue is empty");
        }
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
