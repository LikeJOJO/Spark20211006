package com.atguigu.bigdata.scala.chapter02

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

import com.atguigu.bigdata.scala.bean.Student

import scala.io.{BufferedSource, Source}

object Scala09_Net_Server {

    def main(args: Array[String]): Unit = {

        // TODO 建立服务器
        val server = new ServerSocket(9999)
        println("服务器已经启动...等待客户端的连接")
        // accept方法会导致线程阻塞
        // 当客户端连接到服务器时，线程继续执行
        val client: Socket = server.accept()
//        val stream: InputStream = client.getInputStream
//        val i: Int = stream.read()
//        println("接收到客户端发送的数据：" +i)
//        stream.close()
//        client.close()
        val objIn = new ObjectInputStream(client.getInputStream)
        val student = objIn.readObject()
        println(student)
        objIn.close()
        client.close
        server.close()

    }
}
