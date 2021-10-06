package com.atguigu.bigdata.scala.chapter05

import java.io.{ObjectOutput, ObjectOutputStream}
import java.net.Socket

import com.atguigu.bigdata.scala.bean.Task

object Scala14_Master {

    def main(args: Array[String]): Unit = {

        // 准备数据
        val num = 10
        // 准备逻辑
        def test( start : Int, end : Int ): Unit = {
            for ( i <- start to end ) {
                println(i)
            }
        }

        // 将数据和逻辑进行包装，然后发给不同的worker来执行
        val task1 = new Task()
        task1.logic = test
        task1.start = 1
        task1.end = num / 2
        val task2 = new Task()
        task2.logic = test
        task2.start = num / 2 + 1
        task2.end = num

        // 连接2个Worker
        val worker1 = new Socket("localhost", 1111)
        val objOut1 = new ObjectOutputStream(worker1.getOutputStream)
        objOut1.writeObject(task1)
        objOut1.flush()
        objOut1.close()
        worker1.close()

        val worker2 = new Socket("localhost", 2222)
        val objOut2 = new ObjectOutputStream(worker2.getOutputStream)
        objOut2.writeObject(task2)
        objOut2.flush()
        objOut2.close()
        worker2.close()
    }

}
