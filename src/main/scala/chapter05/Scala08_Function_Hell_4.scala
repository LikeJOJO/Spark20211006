package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell_4 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 地狱版
//        def outer() = {
//            def inner(): Unit = {
//                println("inner...")
//            }
//            inner _
//        }
//
//        outer()()

        // 现在我们的代码体现了一个特殊的语法：闭包
        // 一个函数使用了外部的变量，并且改变了变量的生命周期，将这个变量
        // 包含到当前函数的内部环境当中，形成闭合的效果，这个闭合的环境，称之为闭包环境，简称为闭包
        def outer( i : Int ) = {
             def inner( j : Int ) = {
                 i + j
             }
             inner _
        }

        //println(outer(20)(20))
        // 函数会被编译器编译为方法（private static final）
        val f = outer(20)
        val r = f(30)
        println(r)

    }

}
