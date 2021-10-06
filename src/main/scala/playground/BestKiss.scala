package playground

import scala.collection.mutable

object BestKiss {
    def main(args: Array[String]): Unit = {
        val map1 = mutable.Map(("a", 1), ("b", 2))
        val map2 = mutable.Map(("a", 3), ("d", 4))

        val newMap = map2.foldLeft(map1)(
            ( map, kv ) => {
                val k = kv._1
                val v = kv._2

                val newVal = map.getOrElse(k, 0) + v
                map.update(k, newVal)
                map
            }
        )
        println(newMap)
    }
}
