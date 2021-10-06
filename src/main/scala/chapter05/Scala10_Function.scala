package com.atguigu.bigdata.scala.chapter05

import scala.util.control.Breaks

object Scala10_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 闭包 - 闭合的环境
        // scala 2.12 和2.11版本对闭包的处理不一样。
        // 2.11版本采用匿名函数类来处理闭包
        // spark的版本和scala的版本息息相关
        def outer( i : Int ) = {
            def inner( j : Int): Int = {
                i + j
            }
            inner _
        }

        val intToInt: Int => Int = outer(20)
        intToInt(30)
        
    }
}
