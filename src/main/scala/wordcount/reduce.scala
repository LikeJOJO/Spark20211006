package wordcount

import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable

object reduce {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

//        val rdd = sc.makeRDD(List("lss", "yjy", "lxy", "lxy", "dxy", "yjy", "lxy", "lxy"))
//        val mapWord = rdd.map(
//            word => {
//                mutable.Map[String, Long]((word, 1))
//            }
//        )
//
//        val wordCount = mapWord.reduce(
//            (map1, map2) => {
//                map2.foreach {
//                    case (word, count) => {
//                        val newCount = map1.getOrElse(word, 0L) + count
//                        map1.update(word, newCount)
//                    }
//                }
//                map1
//            }
//        )

        val kiss = sc.makeRDD(List("lss", "yjy", "lxy", "lxy", "dxy", "yjy", "lxy", "lxy"), 3)
        kiss.map(
            word => {
                mutable.Map[String, Long]((word, 1))
            }
        ).reduce(
            (map1, map2) => {
                map2.foreach {
                    case (word, count) => {
                        val newCount = map1.getOrElse(word, 0L) + count
                        map1.update(word, newCount)
                    }
                }
                map1
            }
        ).foreach(println(_))

        sc.stop()
    }
}
