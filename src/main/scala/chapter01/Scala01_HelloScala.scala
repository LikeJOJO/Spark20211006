package com.atguigu.bigdata.scala.chapter01

/*

  TODO object

    1. 等同于在程序中声明类，同时会生成一个单例对象（Scala01_HelloScala）
    2. scala是一个完全面向对象的语言，所以没有静态语法，可以通过object方式来模拟

  TODO Scala01_HelloScala

    类名，同时也是单例对象的名称

  TODO def

    defined(声明)，scala中声明方法的关键字

  TODO main

    方法名，在当前代码中，是一个入口方法,编译后，会自动生成调用的代码
    这个方法其实是成员方法

  TODO ()

    参数列表， 多个参数使用逗号分隔

  TODO args: Array[String]

    参数声明

    java  => String[] args => 强类型语言需要明确类型
    scala => args : Array[String]

        农业文明
        工业文明

        马丁说：不应该这样！！！名称比类型更重要

        参数名 : 参数类型
        String : String

    Array[String] : 马丁希望scala语言是一个完全面向对象的语言，所以数组也有专门的类型
                    这个类型就叫Array, 中括号表示泛型， 表示字符串数组

  TODO Unit =>  main : Unit

      Unit是一个返回值类型，等同于java中void,因为void不是面向对象的语法。

  TODO  =  :

     String s = "abc"
     将方法体赋值给方法变量

  TODO {} : 代码块

  TODO  System.out.println("Hello Scala")

     scala是基于java语言开发的，所以在scala代码中可以直接使用java代码的。

   TODO 代码最后没有使用分号结尾

    马丁说：一行代码表示一个完整的逻辑，所以完全可以靠回车换行来确定的代码
            所以分号可以省略，但是如果一行代码中有多个逻辑，那么分号不能省略

 */
object Scala01_HelloScala {
    def main(args: Array[String]): Unit = {
        //System.out.println("Hello Scala")
        println("Hello Scala")
    }
}
