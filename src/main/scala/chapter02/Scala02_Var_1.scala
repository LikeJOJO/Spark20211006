package com.atguigu.bigdata.scala.chapter02

object Scala02_Var_1 {

    def main(args: Array[String]): Unit = {

        // TODO 变量
        val name : String = "abc"
        // 马丁说：类型没那么重要
        // 类型如果能通过变量值推断出来，那么变量类型可以省略
        // 但是在某些情况下，不能省略, 多态不能省略
        val username = "zhangsan"

        println(username)


    }
}
