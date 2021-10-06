package com.atguigu.bigdata.scala.chapter05

import com.atguigu.bigdata.scala.chapter04.StringUtil

object Scala05_Function_NightMare {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 噩梦版
        // 函数式编程有一个重要的原则 - 至简原则（能省则省）
        //val s = "zhangsan"
//        def test(): String = {
//            return "zhangsan"
//        }
        //println(test())

        // TODO 如果函数一定存在返回值，那么return关键字可以省略
        //      会将函数体中满足条件的最后一行代码的执行结果返回
//        def test(): String = {
//            val age = 30
//            if (age < 30) {
//                "zhangsan" // String
//            } else {
//                "lisi"
//                //println("xxx") // Unit
//            }
//        }
//        println(test())

        // TODO 如果函数的返回值类型可以根据函数体的结果推断出来，那么返回值类型可以省略
//        def test() = {
//            "zhangsan"
//        }
//        println(test())

        // TODO 如果函数体中的代码逻辑只有一行，那么大括号可以省略
//        def test() = "lisi"
//        println(test())

        // TODO 如果函数声明时，没有参数的情况下，参数列表的小括号可以省略
        //      如果省略参数列表，那么调用时就不能加小括号
        //def test = "wangwu"
        //val name = "wangwu"

        // TODO 如果函数的返回值类型明确声明为Unit，那么函数体中的return不起作用
        //      如果函数体中明确使用return关键字返回，那么返回值类型不能省略
        //      如果希望函数没有返回值，但是又希望可以省略,这个时候可以将返回值类型连同等号一起省略
        //      省略返回值类型和等号的情况表示函数没有返回，这样的函数称之为过程函数
//        def test() {
//            return "zhangsan"
//        }
//
//        println(test())

        // TODO 如果函数只关心逻辑的实现，而不关心名称，就可以将关键字和名称省略
        def a( i : Int, j : Int ): Int = {
            return i * j;
        }

        //println( a(10, 20) )
        // 匿名函数
        ( i : Int, j : Int ) => {
            return i * j;
        }

    }
}
