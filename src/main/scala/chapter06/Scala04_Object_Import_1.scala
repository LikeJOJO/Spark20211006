package com.atguigu.bigdata.scala.chapter06



object Scala04_Object_Import_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - import - 导入

        // TODO 5. 在一行中导入一个包中大量类
        // import java.util.{List, ArrayList}
        // TODO 6. 屏蔽类
//        import java.util._
//        import java.sql.{Date=>_, _}
//        new Date()
        // TODO 7. 给类起别名
        //import java.util.{HashMap=>JavaHashMap}
        //new JavaHashMap()
        // TODO 8.scala中包默认采用的是相对路径（当前包）
        //        如果不想使用相对路径，那么需要采用特殊语法:_root_
        //println(new java.util.HashMap())
        println(new _root_.java.util.HashMap())
    }
}
//package java {
//    package util {
//        class HashMap {
//            println("aaaaaa")
//        }
//    }
//}
