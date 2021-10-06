package MeltyKiss.service

import MeltyKiss.application.WordCountApplication.sc
import MeltyKiss.common.TService
import MeltyKiss.dao.WordCountDAO
import org.apache.spark.rdd.RDD

class WordCountService extends TService {
    private val wordCountDAO = new WordCountDAO()

    def anysis() = {

        val lineRDD = wordCountDAO.readFile("apple/test.txt")
        val wordRDD: RDD[String] = lineRDD.flatMap(_.split(" "))

        val wordToOneRDD: RDD[(String, Int)] = wordRDD.map(
            word => {
                println(word)
                (word, 1)
            }
        )

        val wordToCountRDD: RDD[(String, Int)] = wordToOneRDD.reduceByKey(_+_)

        wordToCountRDD.collect()
    }
}
