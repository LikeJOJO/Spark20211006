package com.atguigu.bigdata.scala.chapter03

object Scala01_Ops {

    def main(args: Array[String]): Unit = {

        val s1 = "abc"
        val s2 = "abc"
        val s3 = new String("abc")

        // Scala语言基于java语言开发的。
        // scala中的双等号其实不是双等号，编译时，会转换为非空验证后的equals方法调用。
        println(s1 == s2) // true
        println(s1.equals(s3)) // true
        //println(s1 == s3) // true
        // scala中eq方法在编译时，自动转换为java的双等号操作.
        println(s1.eq(s3))


    }
}
