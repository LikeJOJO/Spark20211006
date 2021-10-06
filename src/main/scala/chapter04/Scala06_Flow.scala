package com.atguigu.bigdata.scala.chapter04

object Scala06_Flow {

    def main(args: Array[String]): Unit = {

        // 循环返回值 : 需要使用特殊的关键字, 循环的每一个值的计算结果都要返回
        val result = for ( i <- 1 to 5 ) yield {
            i * 2
        }
        // 1
        // 5
        // [1,2,3,4,5]
        println(result)

        Thread.`yield`()
    }
}
