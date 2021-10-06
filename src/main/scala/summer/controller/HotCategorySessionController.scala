package summer.controller

import summer.common.TController
import summer.service.{HotCategoryService, HotCategorySessionService}

class HotCategorySessionController extends TController{

    private val hotCategorySessionService = new HotCategorySessionService()
    private val hotCategoryService = new HotCategoryService()

    override def execute(): Unit = {
        val top10: Array[(String, (Int, Int, Int))] = hotCategoryService.analysis()
        val result = hotCategorySessionService.analysis(top10)
        result.foreach(println)
    }
}
