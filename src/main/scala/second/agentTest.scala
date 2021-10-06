package second

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object agentTest {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")
        val sc = new SparkContext(sparkConf)
sc.textFile("/opt/software/datas/word.txt").map(line => {( (line.split(" ")(1), line.split(" ")(4)), 1 )}).reduceByKey(_+_).map { case ( (prv, ad), sum ) => {( prv, (ad, sum) )}}.groupByKey().mapValues(iter => {iter.toList.sortBy(_._2)(Ordering.Int.reverse).take(3)}).foreach(println)



        sc.stop()
    }
}
