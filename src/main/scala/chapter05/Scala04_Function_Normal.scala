package com.atguigu.bigdata.scala.chapter05

import com.atguigu.bigdata.scala.chapter04.StringUtil

object Scala04_Function_Normal {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 普通
        // TODO 可变参数：相同类型的参数可变
        //      1. 使用星号声明在参数类型的后面
        //      2. 可变参数应该是参数列表中的最后一个参数
        //      3. 函数的参数中只能有一个可变参数，而且在最后声明
        def fun( name:String* ): Unit = {
            println(name)
        }

        //fun() // List() => 空集合
        //fun("zhangsan") // WrappedArray(zhangsan)
        //fun("zhangsan", "lisi", "wangwu") // WrappedArray(zhangsan， lisi, wangwu)

        def fun1( password:String, name:String*): Unit = {
            println(name)
        }
        def fun2( age:Int, name:String*): Unit = {
            println(name)
        }
        //fun2(30, "zhangsan" )

        // TODO 参数的默认值
        //  函数的参数默认采用的是val声明的，不能改
        //  函数的参数可以在声明时直接提供默认值
        //  如果参数存在默认值的时候，那么调用时，参数是可以不用传递,此时，使用默认值
        //  如果参数存在默认值的时候，那么调用时，参数如果传值了,此时，传递的值会覆盖默认值
        def fun3( password : String ): Unit = {
            var pswd = password
            if ( StringUtil.isEmpty(pswd) ) {
                pswd = "123123"
            }
        }
        def fun4( password:String = "123123" ): Unit = {
            println(password)
        }

        //fun4()
        //fun4("000000")

        // TODO 带名参数：传递参数的同时增加参数的名称
        //      向指定名称的参数传值
        def fun5( password:String = "123123", name : String ): Unit = {
            println("注册的用户为 ：" + name + "," + password)
        }

        //fun5("000000", "zhangsan")
        fun5( name="zhangsan")
    }
}
