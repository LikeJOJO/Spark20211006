package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks._

object Scala07_Flow {

    def main(args: Array[String]): Unit = {

        // scala中没有continue
        // scala中没有break关键字，但是有相关的语法，只不过是面向对象的
        breakable {
            for ( i <- List(1,5,4,3,2) ) {
                if ( i == 3 ) {
                    break
                }
                println(i)
            }
        }
        println("main方法执行完毕")
    }
}
