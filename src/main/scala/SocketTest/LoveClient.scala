package SocketTest

import java.net.Socket

object LoveClient {
  def main(args: Array[String]): Unit = {
    val client = new Socket("localhost", 9999)

  }
}
