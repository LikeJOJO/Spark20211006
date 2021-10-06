package SocketTest

import java.net.ServerSocket

object LoveServer {
  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(9999)
    println("Chat start")
    val client = server.accept()
  }
}
