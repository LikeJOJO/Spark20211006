package action

import org.apache.spark.{SparkConf, SparkContext}

object foreach {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List("lss", "lxy", "dxy", "yjy", "ly", "sym", "chj", "ry", "sym", "ly", "ly"), 3)

        val beauty = new Beauty()

        list.foreach(
            k => {
                println(beauty.name + k)
            }
        )

        sc.stop()
    }

    class Beauty {
        var name: Int = 18
    }
}
