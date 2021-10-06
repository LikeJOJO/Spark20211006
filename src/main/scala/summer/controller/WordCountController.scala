package summer.controller

import summer.common.TController
import summer.service.WordCountService


class WordCountController extends TController{
    private val wordCountService = new WordCountService()

    def execute(): Unit = {
        val result: Array[(String, Int)] = wordCountService.analysis()
        result.foreach(println)
    }
}
