package summer.application

import summer.common.TApplication
import summer.controller.{HotCategoryController, WordCountController}
import org.apache.spark.{SparkConf, SparkContext}

object HotCategoryApplication extends App with TApplication{

    start( "HotCategory" ){
        val controller = new HotCategoryController()
        controller.execute()
    }
}
