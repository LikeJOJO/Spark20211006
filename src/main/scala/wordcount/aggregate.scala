package wordcount

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable

object aggregate {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

//        val rdd = sc.makeRDD(
//            List(("a", 1), ("b", 2), ("a", 1), ("b", 2), ("a", 1), ("b", 2)), 2
//        )
//        val strRDD: RDD[String] = rdd.map {
//            case (str, sum) => {
//                (str + " ") * sum
//            }
//        }
//
//        val flatMapRDD = strRDD.flatMap(_.split(" "))
//        flatMapRDD.map(s => mutable.Map(s -> 1)).aggregate(mutable.Map[String, Int]())(
//            (map1: mutable.Map[String, Int], map2: mutable.Map[String, Int]) => {
//                map1.foldLeft(map2)(
//                    (innerMap, kv) => {
//                        innerMap(kv._1) = innerMap.getOrElse(kv._1, 0) + kv._2
//                        innerMap
//                    }
//                )
//            },
//            (map1: mutable.Map[String, Int], map2: mutable.Map[String, Int]) => {
//                map1.foldLeft(map2)(
//                    (innerMap, kv) => {
//                        innerMap(kv._1) = innerMap.getOrElse(kv._1, 0) + kv._2
//                        innerMap
//                    }
//                )
//            }
//        ).foreach(println)

        val kiss = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)

        kiss.map(s => mutable.Map(s -> 1)).aggregate(mutable.Map[String, Int]())(
            (map1: mutable.Map[String, Int], map2: mutable.Map[String, Int]) => {
                map1.foldLeft(map2)(
                    (innerMap, kv) => {
                        innerMap(kv._1) = innerMap.getOrElse(kv._1, 0) + kv._2
                        innerMap
                    }
                )
            },
            (map1: mutable.Map[String, Int], map2: mutable.Map[String, Int]) => {
                map1.foldLeft(map2)(
                    (innerMap, kv) => {
                        innerMap(kv._1) = innerMap.getOrElse(kv._1, 0) + kv._2
                        innerMap
                    }
                )
            }
        ).foreach(println)
        sc.stop()
    }
}
