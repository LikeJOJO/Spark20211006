package com.atguigu.bigdata.scala.chapter05

import java.io.ObjectInputStream
import java.net.ServerSocket

import com.atguigu.bigdata.scala.bean.Task

object Scala14_Worker_2 {

    def main(args: Array[String]): Unit = {
        val server = new ServerSocket(2222)
        println("Worker【2222】服务启动，等待连接。。。")
        val master = server.accept()
        println("Master已经连接，等待接收Master传递的数据")

        val objIn = new ObjectInputStream(master.getInputStream)
        val taskObj: AnyRef = objIn.readObject()
        val task = taskObj.asInstanceOf[Task]
        objIn.close()
        // 执行计算
        println("Worke【2222】开始执行计算")
        task.compute()

        master.close()
        server.close()
    }

}
