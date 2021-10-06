package com.atguigu.bigdata.scala.chapter06

object Scala05_Object_Class {

    def main(args: Array[String]): Unit = {

        // TODO - 面向对象 - 类 - class
        // scala也是采用class声明类，但是没有java中的那么多的限制
        //      一个源码文件中可以声明多个类，而且可以都是公共类
        // java中一个源码程序中，可以声明多个类
        // 公共类的名字必须和源码文件相同。
        // 一个类文件中只能有一个公共类

        // 访问权限
        /*
           private   => 私有 => 同类
           (default) => 包权限 => 同类，同包
           protected => 受保护权限 => 同类，同包，子类
           public    => 公共 => 任意
         */
    }
}
class Emp {

}
class User {

}
