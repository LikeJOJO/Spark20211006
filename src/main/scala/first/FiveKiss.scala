package first

import org.apache.spark.{SPARK_BRANCH, SparkConf, SparkContext}

object FiveKiss {
    def main(args: Array[String]): Unit = {
        val list = List(
            Girl("lss", 18),
            Girl("yjy", 16),
            Girl("lxy", 17),
            Girl("ly", 19),
            Girl("dxy", 16)
        )

        list.foreach(
            k => {
                k.age match {
                    case 16 => println(16)
                    case 17 => println(17)
                    case 18 => println(18)
                    case _ => println("Yong and beautiful")
                }
            }
        )

//        val result = list.filter{
//            case Girl(name, age) => {
//                age > 16
//            }
//        }
        //println(result)
    }
}

case class Girl(name: String, age: Int)

//class Girl {
//    var name: String = _
//    var age: Int = _
//}
//
//object Girl {
//    def apply(name: String, age: Int) = {
//        val girl = new Girl()
//        girl.name = name
//        girl.age = age
//        girl
//    }
//}