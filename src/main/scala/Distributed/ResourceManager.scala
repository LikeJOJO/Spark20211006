package Distributed

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}

object ResourceCenter {
    def main(args: Array[String]): Unit = {
        // 1. 与driver进行连接，获取driver的端口号，ip、需要的服务器的台数
        val socket = new ServerSocket(6666)
        while (true){
            val driver: Socket = socket.accept()
            new Thread(new Runnable {
                override def run(): Unit = {
                    val in = new ObjectInputStream(driver.getInputStream)
                    val unit: AnyRef = in.readObject()
                    val message: Array[String] = unit.asInstanceOf[Message].m.split("=|&")
                    //"executorNum,5,driverHost,localhost,driverPort,1234"

                    println(message.mkString(","))
                    val exerutorCount: Int = message(1).toInt
                    val driverHost = message(3)
                    val driverPort  = message(5).toInt


                    //           2.创建服务器
                    for (id <-  1 to exerutorCount) {
                        val executor = new Executor(id,driverPort.toInt, driverHost)
                        executor.start()

                    }

                }
            }).start()

        }
    }

}
