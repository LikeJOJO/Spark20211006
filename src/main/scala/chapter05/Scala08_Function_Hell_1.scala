package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell_1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 地狱版

        // TODO 将函数作为参数来使用
//        def test( name : String ): Unit = {
//            println(name)
//        }
//        test("zhangsan")
        // 参数声明方式：
        //  参数名：参数类型
//        def test( f : (Int, Int)=>Int ): Unit = {
//           println(f(10, 20))
//        }
//
//        def sum( i : Int, j : Int ): Int = {
//            i + j
//        }
//        def minus( i : Int, j : Int ): Int = {
//            i - j
//        }
//        def aaa( i : Int, j : String ): String = {
//            i + j
//        }

        //test(sum)
        //test(sum _)
        //test(minus)
        // TODO 将函数作为参数使用时，一般都是使用匿名函数
        // TODO 匿名函数也有至简原则
        //test( ( i : Int, j : Int ) => { i + j } )
        //test( ( i : Int, j : Int ) => { i * j } )

        //test( ( i : Int, j : Int ) => { i * j } )
        // TODO 函数逻辑代码只有一行，大括号可以省略
        //test( ( i : Int, j : Int ) => i * j )
        // TODO 函数的参数类型可以推断出来，那么参数类型可以省略
        //test( ( i, j ) => i * j )
        // TODO 如果匿名函数中的参数按照顺序只使用一次，那么可以采用下划线代替参数
        //test( _ % _ )

        def test( f : (String)=>Unit ): Unit = {
            f("zhangsan")
        }

        def aaa( s : String ): Unit = {
            println(s)
        }

        //test( ( s : String ) =>{ println(s) } )
        //test( ( s : String ) => println(s) )
        //test( ( s ) => println(s) )
        // TODO 如果参数列表中只有一个参数的情况下，下括号可以省略
       //test( s => println(s) )
        //test( println(_) )
        // 下面的代码不是匿名函数的至简原则,只是一个普通函数的传递
        test( println )
        test( aaa )


    }
}
