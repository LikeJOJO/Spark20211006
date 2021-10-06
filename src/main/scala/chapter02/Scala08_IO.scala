package com.atguigu.bigdata.scala.chapter02

import scala.io.StdIn

object Scala08_IO {

    def main(args: Array[String]): Unit = {

        // TODO IO
        // readLine会将线程阻塞
        // 当从控制台获取内容后可以继续执行
        //val str: String = StdIn.readLine()
        val str = StdIn.readInt()

        println("输入的内容为：")
        println(str + 10)
    }
}
