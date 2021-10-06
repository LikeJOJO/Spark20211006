package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 地狱版

        // TODO scala是一个完全面向对象的语言，所以函数也是对象
        // val user : User = new User()
        // val xxx : XXX = 函数
        def test(): Unit = {
            println("test....")
        }

        // TODO 函数如果没有参数，那么调用时参数列表可以省略
        // TODO 如果想让函数作为对象使用，而不是调用的结果，那么需要使用特殊符号 : 下划线
        // TODO 如果将函数作为对象赋值给一个变量，那么这个变量的类型就是函数类型
        // TODO 如果将函数作为对象来使用，参数的个数最多只能有22个
        // TODO 如果变量的类型明确声明为函数类型，那么函数不需要使用下划线即可赋值
        //val f1 = test
//        val f2 = test _
//        val f3: ()=>Unit = test
//        val f4: Function0[Unit] = test

        //val f = () => {println("zhangsan")}

        //f()
        def test1( i : Int, j : Int ): Int = {
            i + j
        }

        val f : (Int, Int)=>Int = test1

        println(f(10, 20))


    }
}
