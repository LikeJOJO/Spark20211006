object HiScala {
  def main(args: Array[String]): Unit = {
    def fun01(): String = {
      return "lrn"
    }

    def fun01_1(): String = {
      "lrn"
    }

    def fun01_2(): String = "lrn"

    def fun01_3() = "lrn"

    def fun01_4 = "lrn"

    def fun02(): Unit = {
      return "lrn"
    }

    def fun03() {
      return "lrn"
    }

    def fun04(name: String*) = {
      println(name)
      val iterator = name.iterator
      while(iterator.hasNext) {
        println(iterator.next())
//        var aaa = iterator.next()
//        if (!aaa.equals("lxy")) {
//          println(aaa)
//        }
      }
    }

    def fun05(name: String = "lrn", age: Int) = {
      println( name + " is " + age + " years old")
    }

    fun05("lss", 18)
    fun05(age = 19)

    val acd = 18
    val bcd: Byte = 127
    val cde: Char = 'e'
    val fer: Int = 13
    val gde: Long = 15

    def fun06 = println("")

    println("asd".equals(""))
    println("adc".eq("lrn"))

    def fun07() = {
      println("*" * 3)
    }

    fun07
  }
}
