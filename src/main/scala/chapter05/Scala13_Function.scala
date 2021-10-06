package com.atguigu.bigdata.scala.chapter05

object Scala13_Function {

    def main(args: Array[String]): Unit = {

        // TODO - 函数 - 惰性函数（延迟加载）
        // 代码的执行基本上都是顺序执行
        def fun9(): String = {
            println("function...")
            "zhangsan"
        }
        lazy val a = fun9() // 10000 (User)
        println("----------") // 10min
        println(a)

        // function...
        // ----------
        // zhangsan
    }

}
