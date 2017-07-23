《Thinking in Java》 Java编程思想的读书笔记
1、1.39E-43f, 表示1.39*10-43

2、移位操作符
 >>    <<       >>=      <<=        >>>=

3、 打破多层循环嵌套标签，如
```
int i = 0;
outer:
while (true) {
    System.out.println("outer");
    while (true) {
        if (i == 3) {
            System.out.println(3);
            continue;
        }
        if (i == 4) {
            System.out.println(4);
            continue outer;
        }
        i++;
        if (i == 6) {
            System.out.println(6);
            break;//这里只能打断最内层的while循环
        }
        if (i == 9) {
            System.out.println(9);
            break outer;//打断多层嵌套循环 outer
        }
    }
}
```
4、可变参数列表的两种写法：
```
printTest(new Object[]{"1", "2", "3"});
System.out.println("******");
printTest2("1", "2", "3");
static void printTest(Object[] args) {
    for (Object obj : args
            ) {
        System.out.println(obj + "");
    }
}
static void printTest2(String...args) {
    for (String str : args
            ) {
        System.out.println(str + "");
    }
}
```