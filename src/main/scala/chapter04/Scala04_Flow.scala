package com.atguigu.bigdata.scala.chapter04

object Scala04_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 循环
        /*
           java :

           for ( int i = 0; i < 5; i=i+2 ) {
               sout(i)
           }

           List list;

           for ( Object obj : list ) {
               sout(obj)
           }


         */
        /*
           scala

           for ( 循环变量 : 变量类型 <-  集合 ) {

           }

         */

        for ( num : Int <- 1 to 5 ) {
            //println(num)
        }
        for ( num <- 1 to 5 ) {
            //println(num)
        }
        // 步长（循环幅度）
        for ( num <- 1 to 5 by 2 ) {
            //println(num)
        }

        // to表示包含后面的数
        for ( num <- 5 to 1 by -1 ) {
            //println(num)
        }

        // until表示不包含后面的数
        for ( num <- 1 until 5 ) {
            //println(num)
        }

        // 使用集合循环
        for ( num <- Range(1, 5, 2) ) {
            //println(num)
        }

        // 字符串
        for ( s <- "Hello" ) {
            println(s)
        }
    }
}
