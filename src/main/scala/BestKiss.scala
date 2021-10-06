object BestKiss {
  def main(args: Array[String]): Unit = {

    //上面代码没有闭包，但是加了下面的代码就有了
    //改变生命周期的不一定是可变变量或不可变变量，改变函数的生命周期也能算
    //函数是有作用域的，被抛出作用域才会产生闭包，不抛出作用域不会产生闭包

    //有闭包，改变生命周期的可能不是age，而可能是test
    // 控制抽象
//    def test(f: (Int) => Int): Int = {
//      f(20)
//    }
//
//    def sum(i: Int): Int = {
//      i
//    }
//
//    println(test(sum))
//
//    def fun01(f: => Unit): Unit = {
//      f
//    }
//
//    fun01(10)
//    fun01(println())
//    fun01 {
//      for (i <- 1 to 5) {
//        println(i)
//      }
//    }

    val a = this.fun01
    a()
  }



  def fun01() = {
    val age = 30
    def test(): Unit = {
      println(age)
    }

    test _

    //上面代码没有闭包，但是加了下面的代码就有了
    //改变生命周期的不一定是可变变量或不可变变量，改变函数的生命周期也能算
    //函数是有作用域的，被抛出作用域才会产生闭包，不抛出作用域不会产生闭包
  }

}
