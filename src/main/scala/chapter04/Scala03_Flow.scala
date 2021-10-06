package com.atguigu.bigdata.scala.chapter04

object Scala03_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 流程控制
        // scala中所有的表达式都有返回值
        // 这个返回值的结果取决于满足条件的最后一行代码的执行结果
        // scala语言是基于java的，所以是一个强类型语言。
        // result的类型是？
        val age = 20
        val result = if ( age < 30 ) {
            println("1111")
            null
        } else {
            "123"
        }

        // result的值为Unit
        println(result)
    }
}
