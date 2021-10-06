package MeltyKiss.common

import MeltyKiss.application.WordCountApplication.sc
import org.apache.spark.rdd.RDD

trait TDAO {
    def readFile(path: String) = {
        val lineRDD: RDD[String] = sc.textFile(path)
        lineRDD
    }
}
