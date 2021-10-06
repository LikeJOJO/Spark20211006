package com.atguigu.bigdata.scala.chapter05

object Scala10_Function_1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 闭包 - 闭合的环境
        val i = 10
        def test(): Unit = {
            println(i)
        }

        // 马丁 : 此处为闭包
        // 1. 内部函数使用外部函数的变量，会存在闭包
        // 2. 所有的匿名函数都是闭包
        // 3. 将函数作为对象使用都是闭包
        val a = test _
        a()
    }
}
