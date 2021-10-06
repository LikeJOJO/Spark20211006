package com.atguigu.bigdata.scala.chapter02

object Scala10_DataType_2 {

    def main(args: Array[String]): Unit = {

        // TODO 数据类型
        // 将数值范围小的类型直接赋值给数值范围大的类型，自动转换的。
        val b : Byte = 127
        val s : Short = b
        val i : Int = s
        val l : Long = i
        val f : Float = l
        val d : Double = f
        val c : Char = 'A'
        val bln : Boolean = true

        // 默认创建的整数数字是Int类型
        val a = 10
        a
        // 默认创建的浮点数字是Double类型
        val aa = 10.0
        aa

    }
}
