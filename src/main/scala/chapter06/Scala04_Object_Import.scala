package com.atguigu.bigdata.scala.chapter06

object Scala04_Object_Import {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象 - import - 导入
        // 1. 导入类
        // 2. 静态导入（静态属性，静态方法）
        // import语法功能比较单一，scala也进行了扩展

        // TODO 1. 导入类时，其实完全可以全部导入，编译器会自动识别需要导入的内容
        //         scala中星号有特殊的用途，所以采用下划线代替
        // import java.util._
        // TODO 2. Scala语言运行在任意的地方使用import关键字
        //import java.util.Date
        //new Date()
        // TODO 3. Scala语言中才是真正的导包
        //import java.util
        //new util.Date()
        // TODO 4. java中java.lang包是自动导入的。
        //         scala中java.lang包也是不需要导入的。
        //         scala中scala包也是不需要导入的。
        //         scala是可以导入对象的（类似于java的静态导入）
        //         scala中默认导入了一个对象(Predef)，这个对象的方法可以直接使用
        //println("abc")
    }
}
