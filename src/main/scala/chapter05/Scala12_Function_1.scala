package com.atguigu.bigdata.scala.chapter05

object Scala12_Function_1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 递归

        // 尾递归 ： 递归的优化
        //          尾递归也会出现栈滚动错误，但是出现的时机会晚很多
        // 马丁：对尾递归进行了优化，在编译时，转换了递归的实现方式:while(true)
        test()
    }
    // 阶乘
    def test( ):Unit = {
        println("zhangsan")
        test()
    }
}
