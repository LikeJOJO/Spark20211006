package com.atguigu.bigdata.scala.chapter05

object Scala11_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 柯里化
        // 将复杂，无关的参数进行简化，形成多个参数列表，让参数之间降低耦合性。
//        def test( i : Int, j : Int ): Unit = {
//            // 5min
//            for ( a <- 1 to i ) {
//                println(a)
//            }
//            println("****************")
//            // 10min
//            for ( b <- 1 to j ) {
//                println(b)
//            }
//        }
//
//        val i = 5 // 5min
//        val j = 10 // 10min
//
//        test(i, j)

        def test( i : Int )( j : Int ): Unit = {
            println(i + j)
        }

        test(10)(20)

    }
}
