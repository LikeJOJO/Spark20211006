package six

object LastKiss {
    def main(args: Array[String]): Unit = {

        val slidlist = List(1,2,3,5,6,4,1)
        val iterator: Iterator[List[Int]] = slidlist.sliding(2, 2)
        iterator.foreach(println)

//        val iterator1: Iterator[List[Int]] = slidlist.sliding(3,3)
//        iterator1.foreach(println)

//        val girls = List(
//            Beauty("lss", 18),
//            Beauty("lxy", 16),
//            Beauty("yjy", 15),
//            Beauty("dxy", 17),
//            Beauty("gr", 19),
//            Beauty("sym", 16),
//            Beauty("chj", 16),
//            Beauty("ly", 16)
//        )
//
//        val result = girls.sortWith(
//            (left, right) => {
//                if (left.age > right.age) true
//                else if (left.age == right.age) left.name < right.name
//                else false
//            }
//        )
//
//        println(result)

//        val result = girls.map{
//            case Beauty(name, age) => {
//                if (age > 17) {
//                    Beauty(name, age)
//                }
//            }
//        }

//        val result = girls.filter(
//            k => {
//                if (k.age > 16) {
//                    true
//                } else {
//                    false
//                }
//            }
//        )

//        val result = girls.filter {
//            case Beauty(name, age) => {
//                if (age > 16) {
//                    true
//                } else {
//                    false
//                }
//            }
//        }
//
//        result.foreach(println(_))
    }
    case class Beauty(name: String, age: Int)
}
