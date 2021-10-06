package com.atguigu.bigdata.scala.chapter05

import scala.util.control.Breaks

object Scala09_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 控制抽象 - 将代码逻辑作为参数进行传递
//        def test( f : (Int)=>Unit ): Unit = {
//            f(20)
//        }
//
//        def xxx(i:Int): Unit = {
//            println(i)
//        }
//
//        test(xxx)
//        test( (i:Int)=>{println(i)} )
//        test( (i:Int)=>println(i) )
//        test( (i)=>println(i) )
//        test( i=>println(i) )
//        test( println(_) )
        def test1( f : => Unit ): Unit = {
    println("xxxxx")
           f // 调用传递进来的逻辑
        }

        // 如果传递的代码是一行逻辑，那么可以直接使用小括号
        //  但是如果传递的代码是多行逻辑，那么必须使用大括号代替小括号
        //test1(/*TODO 代码*/)
        //test1(20)
        /*
        test1 {
            for ( i <- 1 to 5 ) {
                println(i)
            }
        }
        */

        // TODO 控制抽象的应用
        Breaks.breakable {
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    Breaks.break()
                }
            }
        }

        
    }
}
