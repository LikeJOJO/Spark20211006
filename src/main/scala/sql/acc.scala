import org.apache.spark.util.AccumulatorV2
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable

object acc {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)
        val list = sc.makeRDD(List(("a", 1), ("b", 3), ("c", 5), ("d", 7), ("e", 9)))
//        val acc = new MyAcc()
//        sc.register(acc)
//        list.foreach {
//            case (_, y) => {
//                acc.add(y)
//            }
//        }
//        println(acc.value)
        sc.stop()
    }
}

//class MyAcc extends AccumulatorV2[mutable.Map[String, Int], mutable.Map[String, Int] {
//
//}
