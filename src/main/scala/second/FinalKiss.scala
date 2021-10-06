package second

import org.apache.spark.{SPARK_BRANCH, SparkConf, SparkContext}

object FinalKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("MeltyKiss")
        val sc = new SparkContext(sparkConf)

        val list1 = sc.makeRDD(List("chj", "lxy", "chj", "ly", "chj", "ly", "ly", "lss", "chj", "lxy", "yjy", "yjy"), 3)
        val list2 = sc.makeRDD(List(("chj", 3), ("lxy", 2), ("chj", 5), ("ly", 6), ("lss", 5), ("ly", 7)))
        val list3 = sc.makeRDD(List("chj sym yjy chj dxy", "lss ly yjy dxy sym", "chj chj chj", "yjy ly sym", "sym dxy", "sym"))
        val list4 = sc.textFile("apple/test.txt")

//        val like = sc.makeRDD(List(List("chj", "ly"), "sym", List("lss", "lxy", "yjy")))
//        like.flatMap(
//            k => {
//                k match {
//                    case list: List[_] => list
//                    case _ => List().iterator
//                }
//            }
//        ).foreach(println(_))

        val like = sc.makeRDD(List(("chj", 3), ("lxy", 2), ("chj", 5), ("ly", 6), ("lss", 5), ("ly", 7)))
        //like.map
        like.flatMap(
            k => {
                List(k._1, k._2)
            }
        ).collect().foreach(println(_))
        println("============")
        val kiss = sc.makeRDD(List(Beauty("chj", 3), Beauty("lxy", 2), Beauty("chj", 5), Beauty("ly", 6), Beauty("lss", 5), Beauty("ly", 7)))
        kiss.flatMap(
            k => {
                List(k.name, k.age)
            }
        ).collect().foreach(println(_))
        sc.stop()
    }

    class Beauty extends Serializable {
        var name: String = _
        var age: Int = _
    }

    object Beauty {
        def apply(name: String, age: Int): Beauty = {
            val beauty = new Beauty()
            beauty.name = name
            beauty.age = age
            beauty
        }
    }
}
