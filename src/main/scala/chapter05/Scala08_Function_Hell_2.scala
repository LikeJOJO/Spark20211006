package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell_2 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 地狱版
        def worker( i : Int, j : Int, f : (Int, Int)=>Int ): Int = {
            f(i, j)
        }

        def sum( i : Int, j : Int ): Int = {
            i + j
        }
        def minus( i : Int, j : Int ): Int = {
            i - j
        }

        //val r = calc(10, 20, ( i : Int, j : Int ) => { i + j })
        //val r = calc(10, 20, ( i : Int, j : Int ) => i + j )
        //val r = calc(10, 20, ( i, j ) => i + j )

        def master(): Unit = {
            val r = worker(10, 20, _ + _ )
        }
        master()


    }

}
