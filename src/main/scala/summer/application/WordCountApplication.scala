package summer.application

import summer.common.TApplication
import summer.controller.WordCountController

object WordCountApplication extends App with TApplication {
    //start(new WordCountController)
    //override def getController() = new WordCountController

    start("WordCount"){
        val controller = new WordCountController()
        controller.execute()
    }
}
