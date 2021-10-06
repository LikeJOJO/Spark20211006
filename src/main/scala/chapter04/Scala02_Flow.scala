package com.atguigu.bigdata.scala.chapter04

object Scala02_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 流程控制

        val age = 35
        // 分支判断
        // 所谓的分支判断其实就是if语法
        // 单分支
        // 如果分支逻辑中只有一行代码,大括号可以省略
//         if ( age < 30 ) {
//             println("年龄小于30")
//         }
//         println("年龄大于等于30")
        // 双分支
//        if ( age < 30 ) {
//            println("年龄小于30")
//        } else {
//            println("年龄大于等于30")
//        }
        // 多分支
        if ( age < 16 ) {
            println("少年")
        } else if ( age < 36 ) {
            println("青年")
        } else if ( age < 45 ) {
            println("壮年")
        } else if ( age < 60 ) {
            println("中年")
        } else {
            println("老年")
        }
    }
}
