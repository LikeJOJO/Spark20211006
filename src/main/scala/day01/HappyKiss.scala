package day01

import org.apache.spark.{SparkConf, SparkContext}

object HappyKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("MeltyKiss")
        val sc : SparkContext = new SparkContext(sparkConf)

//        val data = Array(1, 2, 3, 4, 5)
//        val distData = sc.parallelize(data)
//        val result = distData.reduce((a, b) => a + b)
//        println(result)

        val lines = sc.textFile("love/word.txt")
        val lineLengths = lines.map(s => s.length)
        val totalLength = lineLengths.reduce((a, b) => a + b)
        println(totalLength)
    }
}
