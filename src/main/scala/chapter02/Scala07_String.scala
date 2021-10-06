package com.atguigu.bigdata.scala.chapter02

object Scala07_String {

    def main(args: Array[String]): Unit = {

        // TODO String
        // scala中没有字符串，用的就是java中的字符串
        val name : String = "zhangsan"
        val password : String = "123123"

        // 拼接字符串
        //println("name = "+name+", password = " + password)

        // 传值字符串
        // SQL => "\\%"
        //printf("name = %s, password = %s\n", name, password)
        //printf("name = %s, password = %s", name, password)

        // 插值字符串(推荐使用)
        //println("name = ${name}, password = ${password}")
        //println(s"name = ${name.substring(0,1)}, password = ${password}")

        // JSON : JavaScript Object Notation
        // JSON 字符串
        //val json = s"{\"name\":\"${name}\", \"passwprd\":\"${password}\"}"
        //val json1 = "{\"name\":\""+name+"\", \"passwprd\":\""+password+"\"}"
        //println(json)

        // 多行字符串
        // 竖线表示顶格符
        println(
            s"""
              | name
              | =
              | ${name}
            """.stripMargin)

        println(
            s"""
                password
                =
                ${password}
            """.stripMargin)

        println(
            s"""
              | {"name":"${name}", "password":"${password}"}
            """.stripMargin)

        // SQL
        println(
            """
              | select
              |   *
              | from user  u
              | join classes c on u.cid = c.id
            """.stripMargin)

    }
}
