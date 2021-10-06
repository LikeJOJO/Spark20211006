package Distributed

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}

object Driver {
    def main(args: Array[String]): Unit = {
        //1. 与resourceCenter进行连接，并将驱动类的端口号、ip、和需要的服务台的台数的消息发送给资源中心
        //1.1 数据准备阶段，将发送的消息封装成一个样例类
        val executorNum = 5
        val driverPort = 9999
        val driverHost = "localhost"
        val message = Message(s"executorNum=${executorNum}&driverHost=${driverHost}&driverPort=${driverPort}")

        // 1.2  与resourceCenter连接,并将准备的数据发送给资源中心
        val socket = new Socket("localhost", 6666)
        val out = new ObjectOutputStream(socket.getOutputStream)
        out.writeObject(message)
        out.flush()
        socket.close()

        // 2. 创建一个服务器，任务传输给执行器
        val receiver = new ServerSocket(driverPort)

        // TODO 接收Executor端的数据
        // 线程安全问题

        val start = System.currentTimeMillis()
        val results: Array[Int] = Array.fill(executorNum)(-1)

        new Thread(
            new Runnable {
                override def run(): Unit = {
                    // TODO 统计结果的线程
                    var flg = true
                    while (flg) {
                        if (results.contains(-1)) {
                            Thread.sleep(100)
                        } else {
                            // TODO 所有的线程都已经计算完毕
                            val end = System.currentTimeMillis()
                            println("计算完毕，结果为 " + results.sum + ",耗时:" + (end - start) + "ms")
                            flg = false
                            System.exit(0)
                        }
                    }
                }
            }
        ).start()

        while (true) {
            val executorRef: Socket = receiver.accept()
            new Thread(new Runnable {
                override def run(): Unit = {
                    // 2.1 发送任务给到执行器
                    val exerutorOutputStream = new ObjectOutputStream(executorRef.getOutputStream)
                    val task = new Task
                    task.func = _ * 2
                    exerutorOutputStream.writeObject(task)
                    exerutorOutputStream.flush()
                    exerutorOutputStream.close()
                    executorRef.shutdownInput()

                    //2.2 获取执行器的返回的结果
                    // TODO 获取Executor端计算结果
                    val executorRefIn =
                    new ObjectInputStream(executorRef.getInputStream)
                    val message: Message = executorRefIn.readObject().asInstanceOf[Message]
                    val datas: Array[String] = message.m.split("=|&")
                    // executorId=${id}&result=$i
                    // executorId
                    // id
                    // result
                    // i
                    results(datas(1).toInt-1) = datas(3).toInt
                    //println("获取计算结果 = " + result)
                }
            }).start()
        }
    }
}
