package com.atguigu.bigdata.scala.chapter05

object Scala03_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数
        // 声明方式

        // 1. 无参，无返回值
        def fun1(): Unit ={
            println("f1....")
        }

        // 调用函数
        //fun1()
        //fun1

        // 2. 无参，有返回值
        def fun2(): String = {
            return "zhangsan"
        }

        val name = fun2
        //println(name)

        // 3. 有参，无返回值
        def fun3( name:String ): Unit = {
            println("name = " + name)
        }
        //fun3("lisi")

        // 4. 有参，有返回值
        def fun4( num:String ): Int = {
            return num.toInt
        }

        val num = fun4("123") + 123
        //println(num)

        // 5. 多参，无返回值
        def fun5( name : String, password : String ): Unit = {
            println(s"name = ${name}, password = ${password}")
        }

        // 如果函数有多个参数，调用时，应该所有的参数都需要传值
        // 传值给参数时，按顺序匹配
        //fun5("zhangsan", "123123")
        // 6. 多参，有返回值
        def fun6( name1 : String, name2 : String ): String = {
            val s = new StringBuilder
            s.append(name1)
            s.append(name2)
            return s.toString()
        }

        val namex = fun6("zhangsan", "lisi")
        //println(namex)

        // 7. 参数的个数（Any）(可以超过22个)
        def fun7(
                        a1:Int,
                        a2:Int,
                        a3:Int,
                        a4:Int,
                        a5:Int,
                        a6:Int,
                        a7:Int,
                        a8:Int,
                        a9:Int,
                        a10:Int,
                        a11:Int,
                        a12:Int,
                        a13:Int,
                        a14:Int,
                        a15:Int,
                        a16:Int,
                        a17:Int,
                        a18:Int,
                        a19:Int,
                        a20:Int,
                        a21:Int,
                        a22:Int,
                        a23:Int,
                        a24:Int,
                        a25:Int
                ): Unit = {
            println("fun7...")
        }

        //fun7(1,2,3,4,5,6,7,8,9,0, 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5)

        //val a = fun7 _
        //a(1,2,3,4,5,6,7,8,9,0, 1,2,3,4,5,6,7,8,9,0,1,2,3,4,5)
    }
}
