package com.atguigu.bigdata.scala.chapter02

import java.io.PrintWriter

import scala.io.{BufferedSource, Source}

object Scala08_IO_Out {

    def main(args: Array[String]): Unit = {

        // TODO IO - Out
        val writer = new PrintWriter("data/output.txt")

        writer.println("zhangsan")
        writer.println("lisi")
        writer.flush()

        writer.close()
    }
}
