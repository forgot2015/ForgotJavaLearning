public class Demo2 {
    public static void main(String[] args){
        int a = 5;//定义一个变量；
        boolean b = (a<4)&&(a++<10);
//        执行完 (a<4) 发现是false就中断了，所以不会去执行a++
        System.out.println("使用短路与逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);

         b = (a<4)&(a++<10);
        System.out.println("使用按位与逻辑运算符的结果为"+b);
        System.out.println("a的结果为"+a);
    }

//    public static void main(String[] args) {
//        int a = 1, b = 2;
//        System.out.println("a = " + a + ", b = " + b);
//        swap(a, b);
//        System.out.println("after swap a = " + a + ", b = " + b);
//    }
//
//    private static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
}
