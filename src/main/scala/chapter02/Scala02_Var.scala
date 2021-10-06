package com.atguigu.bigdata.scala.chapter02

object Scala02_Var {

    def main(args: Array[String]): Unit = {

        // TODO 变量
        // scala中变量的语法声明:
        // var 变量名 : 变量类型 = 变量值
        var username : String = "zhangsan"
        username = "lisi"

        // scala中变量没有办法使用final关键字
        // scala使用另外一个关键字val让变量值不能修改
        val username1 : String = "zhangsan"
        //username1 = "wangwu"

        // 马丁说：不方便！！！

        // 访问变量
        println( username )


    }
}
