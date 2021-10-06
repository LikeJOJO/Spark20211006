package com.atguigu.bigdata.scala.chapter05

object Scala02_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数

        // 函数声明
        /*
        def 函数名( 参数1，参数2 ):函数返回值类型 = {
            函数体
        }
         */
        // java语法中没有函数的概念
        // scala在编译时，会将函数编译为private static final 的方法
        // scala中编译时，会改变函数的名称,担心和类的方法冲突
        def test( name:String ):String = {
            return name.substring(0,1).toUpperCase
        }

        // 函数调用
        val n = this.test( "zhangsan" )

        println(n)

    }
    def test( name:String ):String = {
        return name.substring(0,2).toUpperCase
    }
}
