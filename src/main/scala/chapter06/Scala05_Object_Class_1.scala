package com.atguigu.bigdata.scala.chapter06

object Scala05_Object_Class_1 {

    def main(args: Array[String]): Unit = {

        // TODO - 面向对象 - 类 - class

        // jvm会默认给类提供无参构造方法
        // 因为是无参构造方法，所以new的时候，小括号可以省略
        val user = new User()
        val user1 = new User

    }
    class User {

    }
}
