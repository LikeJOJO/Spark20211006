package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell_3 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 地狱版

        // TODO 函数作为函数的返回值使用
//        def test(): String = { // 函数类型
//            "zhangsan" // 函数
//        }
//        val name = test()
//        println(name)
        def sum( i : Int, j : Int ): Int = {
            i + j
        }

        def test() = {
            // 将sum方法作为返回值返回
            sum _
        }

        //val f : (Int, Int)=>Int = test()
        //val f = test()
        // println(f(10, 20))
        println(test()(10, 20))
        // test()()()()()()


    }

}
