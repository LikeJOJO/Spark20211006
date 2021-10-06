package summer.application

import summer.common.TApplication
import summer.controller.{HotCategoryController, HotCategorySessionController}

object HotCategorySessionApplication extends App with TApplication{

    start( "HotCategory" ){
        val controller = new HotCategorySessionController()
        controller.execute()
    }
}
