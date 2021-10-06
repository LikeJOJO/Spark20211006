package com.atguigu.bigdata.scala.chapter02

import java.io.{ObjectOutputStream, OutputStream}
import java.net.Socket

import com.atguigu.bigdata.scala.bean.{Student, User}

object Scala09_Net_Client {

    def main(args: Array[String]): Unit = {

        // 创建服务器的连接
        val client = new Socket("localhost", 9999)

        // 传递普通数据
//        val stream: OutputStream = client.getOutputStream
//        stream.write(300)
//        stream.close()
//        println("向服务器发送数据300")

        // 传递对象
        // 对象输出流
        // NotSerializableException
        val outObj = new ObjectOutputStream(client.getOutputStream)

        val user : Student = new Student()
        user.name = "lisi"
        user.age = 50

        outObj.writeObject(user)
        outObj.flush()
        outObj.close()

        client.close()
        
    }
}
