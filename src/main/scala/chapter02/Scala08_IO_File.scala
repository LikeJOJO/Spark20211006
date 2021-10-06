package com.atguigu.bigdata.scala.chapter02

import scala.io.{BufferedSource, Source}

object Scala08_IO_File {

    def main(args: Array[String]): Unit = {

        // TODO IO - File
        // 文件路径：
        // 绝对路径：不可改变的路径
        //     网络地址=> http://192.168.0.1:3306/test/test.html
        //     本地地址=>file:///d:/test/test.html
        // 相对路径：可以改变的路径，存在一个基准路径
        //     以当前文件所在的路径为基准。(HTML)
        //     IDEA中的基准路径为项目的根路径
        val source: BufferedSource = Source.fromFile("data/word.txt")
        val strings: Iterator[String] = source.getLines()
        while ( strings.hasNext ) {
            println(strings.next())
        }

        source.close()
    }
}
