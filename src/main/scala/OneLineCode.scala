object OneLineCode {
  def main(args: Array[String]): Unit = {
    val count = 9
    for (i <- 1 to count) println(" " * (count - i) + "*" * (2 * i - 1))
  }
}
