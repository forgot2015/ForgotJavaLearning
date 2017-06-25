# ForgotHeadFirstJava
HeadFirstJava 笔记

## 第一章 基本概念(P1~26)
基本语句，if else, for循环, while循环
````
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
````
## 第二章 拜访对象村(P28~47)
- 面向过程编程和面向对象编程的区别。 面向对象的可扩展性强，在需求不断更改的时候仍能很好地扩展，而面向过程则会改动很大
- 类的继承，方法重写。
- 对象是类的一个实例

## 第三章 认识变量(P49~69)
- 变量的声明，需指定变量的类型，new对象时类型不对会报错
- 8中基本类型，byte,short,int,long,float,double,boolean,char
- 类型的转换，如int转long，String转float,注意long转int时有可能溢出，导致值变化
- java关键字，变量命名不能与关键字重名
- 垃圾回收堆，常量池，栈
- 数组也是对象
- Java里的是引用传递，而不是值传递

## 第四章 对象的行为