package MeltyKiss.controller

import MeltyKiss.application.WordCountApplication.sc
import MeltyKiss.service.WordCountService
import org.apache.spark.rdd.RDD

class WordCountController {
    private val wordCountService = new WordCountService()

    def dispatch(): Unit = {
        //wordCountService.anysis().foreach(println)
    }
}
