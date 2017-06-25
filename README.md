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

## 第四章 对象的行为(P70~94)
- 对象的行为和状态（方法和实例变量）。对象影响行为，行为印象状态
- 方法中的返回值,如int String , Object类型
- 方法的参数，向方法中传入多个参数 (Object... args)
- void方法可以没有返回值
- Java的封装，实例变量用修饰符private,用getter和setter方法来保证变量安全性（如可在setter方法中进行限制，检查参数是否能执行），而且改变封装的方法，不会影响到他人的引用，若直接修改变量的话，改动就大了。而直接存取变量对效率的提高并没那么大
- 实例变量和局部变量。 实例变量是在类内的变量，有默认值，可以不初始化就引用。而局部变量是在方法内的变量，没有默认值，若不初始化就引用，会报错
- 用==来判别两个引用是否都指向同一个对象，重写equal和hashcode方法来判断是否值相同
-
## 第五章 超强力方法 （P95~）
- 随机数的产生 Math.random()产生0~1的随机数