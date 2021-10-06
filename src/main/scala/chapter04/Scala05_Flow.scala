package com.atguigu.bigdata.scala.chapter04

object Scala05_Flow {

    def main(args: Array[String]): Unit = {

        // 循环守卫
//        for ( i <- 1 to 5 if i % 2 == 0 ) {
//            // 循环体
        // insert
//            //println(i)
//        }
//        for ( i <- 1 to 5 ) {
//            //循环体
              // insert
//            if ( i % 2 == 0 ) {
//                println(i)
//            }
//        }

        // 循环嵌套
//        for ( i <- Range(1,5); j <- Range(1,4) ) {
//            //println("i = " + i + ",j = " + j )
//        }
//
//        for ( i <- Range(1,5) ) {
//            // Coding
//            for ( j <- Range(1,4) ) {
//                println("i = " + i + ",j = " + j )
//            }
//        }

        // 循环变量
        for ( i <- Range(1,5); j = i - 1 ) {
            println("j = " + j )
        }
    }
}
