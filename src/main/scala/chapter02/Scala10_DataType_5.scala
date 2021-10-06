package com.atguigu.bigdata.scala.chapter02

object Scala10_DataType_5 {

    def main(args: Array[String]): Unit = {

        // TODO 数据类型
        // scala中null其实是一个对象，类型就是Null
        val s : String = null
        val s1 = null

        // 无法将任意引用类型的数据赋值给任意值类型变量，反之相同

        // Any类型是整个Scala中通用类型。


    }
    def test(): Nothing = {
        throw new Exception
    }

}
