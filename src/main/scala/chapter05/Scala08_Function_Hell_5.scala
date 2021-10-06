package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Hell_5 {

    def main(args: Array[String]): Unit = {

        val age = 30

        def test(): Unit = {
            println(age)
        }

        test()

    }

}
