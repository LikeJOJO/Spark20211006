package com.atguigu.bigdata.scala.chapter05

object Scala12_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数 - 递归
        // 1. 方法调用自身 (概念)
        // 2. 调用时应该有跳出的逻辑
        // 3. 方法在调用时，传递的参数应该有规律
        // 4. 函数需要明确返回值类型（scala）
        // 5. 如果递归函数调用层次过深，依然会出现错误
        // scala : 阶乘
        println(test(1000000)) // 5 * 4 * 3 * 2 * 1 = 120
    }
    // 阶乘
    def test( num:Int ):Int = {
        if ( num <= 1 ) {
            1
        } else {
            num + test(num - 1)
        }
    }
}
