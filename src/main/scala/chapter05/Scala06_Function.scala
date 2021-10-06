package com.atguigu.bigdata.scala.chapter05

object Scala06_Function {

    def main(args: Array[String]): Unit = {

        def test( name : String = "zhangsan" ): Unit = {
            println(name)
        }

        // TODO 有默认值的参数，可以不需要传递，但是参数列表不能省略
        // TODo 参数默认值编译后，其实是自动生成了一些方法实现类似的功能
        test()

    }
}
