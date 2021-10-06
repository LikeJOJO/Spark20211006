package CompareFiles

import scala.beans.BeanProperty

object OneLastKiss {
  def main(args: Array[String]): Unit = {
    val girl = new Girl()
    girl.setName("")
    println(girl.name)
  }

  class Girl {
    @BeanProperty
    var name: String = "lss"
    val age: Int = 16
  }

}

//package Parent {
//  package Children {
//    class Boy {
//      var name:String = _
//      var age: Int = _
//    }
//  }
//}
