package Distributed

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

class Executor(val id: Int, val driverPort: Int, val driverHost: String) {
    def start() {
        // 创建一个客户端
        val driverRef = new Socket(driverHost, driverPort)
        val driverRefIn = new ObjectInputStream(driverRef.getInputStream)
        val task: Task = driverRefIn.readObject().asInstanceOf[Task]
        task.num = id
        val i: Int = task.Com()
        driverRef.shutdownInput()

        // 创建一个输出流
        val executorOut = new ObjectOutputStream(driverRef.getOutputStream)
        executorOut.writeObject(Message(s"exerutor=${id}&result=${i}"))
        executorOut.flush()
        driverRef.close()
    }
}
