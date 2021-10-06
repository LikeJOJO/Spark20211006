package dream

import org.apache.spark.{SparkConf, SparkContext}

object reduce {
    def main(args: Array[String]): Unit = {
//        val list = List(("lss lxy yjy", 3), ("chj dxy", 2), ("lss chj", 7), ("chj chj", 1), ("yjy sym yjy ly dxy zhy", 5))
//        println(list.flatMap(
//            k => {
//                k._1.split(" ").map(
//                    t => {
//                        (t, k._2)
//                    }
//                )
//            }
//        ).groupBy(
//            t => {
//                t._1
//            }
//        ).mapValues(
//            x => {
//                x.map(
//                    y => {
//                        y._2
//                    }
//                )
//            }
//        ).map(
//            z => {
//                (z._1, z._2.sum)
//            }
//        ))

        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(("lss lxy yjy", 3), ("chj dxy", 2), ("lss chj", 7), ("chj chj", 1), ("yjy sym yjy ly dxy zhy", 5)))
        val seq = sc.makeRDD(Seq(("lss lxy yjy", 3), ("chj dxy", 2), ("lss chj", 7), ("chj chj", 1), ("yjy sym yjy ly dxy zhy", 5)))

        seq.flatMap(
            k => {
                k._1.split(" ").map(
                    t => {
                        (t, k._2)
                    }
                )
            }
        ).reduceByKey(_ + _).collect().foreach(println(_))


        sc.stop()
    }
}
