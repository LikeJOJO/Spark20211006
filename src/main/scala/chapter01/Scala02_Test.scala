package com.atguigu.bigdata.scala.chapter01

object Scala02_Test {
    def main(args: Array[String]): Unit = {

        //System.out.println(Scala02_Test.test())
        // scala中println方法底层调用的其实就是java中的打印
        //println(Scala02_Test.test())
        println(test())
    }
    // 模仿方法的声明
    def test(): String = {
        return "zhangsan"
    }
}
