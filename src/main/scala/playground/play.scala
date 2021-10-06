package playground

object play {
    def main(args: Array[String]): Unit = {
        //去掉var，默认就是val，就无法使用属性
        val car = new Car("Ferrari", 348)
        println(car.brand)
        println(car.price)
    }
}

class Car(var brand: String, var price: Double) {
//    def run(speed: Int) = {
//        println(s"It's speed is ${speed} km/h")
//    }
//    def this() {
//        this("", 18)
//    }
//
//    def this(brand: String) {
//        this(brand, 100)
//    }
}
