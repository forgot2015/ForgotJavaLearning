import java.util.Stack;

public class Main {
    static Stack<Integer> stack1 = new Stack<Integer>();
    public static void main(String[] args) {
        System.out.println("Hello World!");
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1.pop());
        //只查询，不出栈
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
    }
}
