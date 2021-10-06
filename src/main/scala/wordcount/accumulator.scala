package wordcount

import org.apache.spark.util.AccumulatorV2
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable

// KISS 没有Shuffle，性能比其他好很多

object accumulator {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)
        val wcAcc = new MyAccumulator()
        sc.register(wcAcc, "wordCountAccumulator")
        list.foreach(
            word => {
                wcAcc.add(word)
            }
        )
        println(wcAcc.value)
        sc.stop()
    }

    class MyAccumulator extends AccumulatorV2[String, mutable.Map[String, Int]] {
        private var wordCount = mutable.Map[String, Int]()

        override def isZero: Boolean = wordCount.isEmpty

        override def copy(): AccumulatorV2[String, mutable.Map[String, Int]] = new MyAccumulator

        override def reset(): Unit = wordCount.clear()

        override def add(v: String): Unit = {
            val newCnt = wordCount.getOrElse(v, 0) + 1
            wordCount.update(v, newCnt)
        }

        override def merge(other: AccumulatorV2[String, mutable.Map[String, Int]]): Unit = {
            val map1 = this.wordCount
            val map2 = other.value

            map2.foreach{
                case (word, count) => {
                    val newCount = map1.getOrElse(word, 0) + count
                    map1.update(word, newCount)
                }
            }
        }

        override def value: mutable.Map[String, Int] = wordCount
    }
}
