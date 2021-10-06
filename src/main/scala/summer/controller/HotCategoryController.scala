package summer.controller

import summer.common.TController
import summer.service.HotCategoryService

class HotCategoryController extends TController{

    private val hotCategoryService = new HotCategoryService()

    override def execute(): Unit = {
        val result = hotCategoryService.analysis()
        result.foreach(println)
    }
}
