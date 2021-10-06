package com.atguigu.bigdata.scala.chapter06

import com.atguigu.bigdata.scala.bean.Task

object Scala04_Object_Import_2 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - import - 导入对象
        // 导入对象的语法只支持使用val声明的变量
        val task = new Task()
        import task._

        compute()

    }
}
