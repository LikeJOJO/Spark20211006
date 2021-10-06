package MeltyKiss.application

import MeltyKiss.controller.WordCountController
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCountApplication extends App {
    val sparkConf = new SparkConf().setMaster("local").setAppName("WordCount")
    val sc = new SparkContext(sparkConf)

    val controller = new WordCountController()
    controller.dispatch()

    sc.stop()
}
