# 个人 Java 学习笔记
包括一些个人的读书笔记，还有一些个人想探讨的知识点

# 读书笔记
## [HeadFirstJava](HeadFirstJava.md)
Java入门好书籍，讲的浅显易懂，也能学到不少知识点，新手用来入门，高手用来查漏补缺好了

## [EffectiveJava](EffectiveJava.md)

## [Java核心技术]()

<br>

# 个人整理
## 关于Socket
## 设计模式
## 排序算法
## 关于内存泄漏
## 关于多线程


## MarkDown写作基本语法

## 1.标题

*2.斜体*

**3.粗体**

***4.粗斜体***

- 5.无序
- 列表

1. 6.有序
2. 列表

```
7.代码块
package headfirstjava;

/**
 * Created by forgot on 2017/6/25.
 */
public class Loopy {
    public static void main(String[] args){
        int x=1;
        System.out.println("before the loop");
        while (x<4){
            System.out.println("in the loop");
            System.out.println("value of x is "+x);
            x++;
        }
        System.out.println("This is after the loop");
    }
}
```

8.
[图片或超连接，点击才跳转到图片](LICENSE)

[超链接2](http://linzongfu.com)

![内部文件夹图片](test.png)

![外部文件夹图片](./pictures/test2.png)

一个点代表一个层级，也就是有可能是. ...