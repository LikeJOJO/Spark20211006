package second

import org.apache.spark.{Partitioner, SparkConf, SparkContext}


object ForeverKiss {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val list = sc.makeRDD(List(("lss", 12), ("lxy", 21), ("lss", 15), ("yjy", 21), ("ly", 22), ("dxy", 45), ("ly", 18), ("yjy", 16)))
        list.partitionBy(new KissPartitioner()).saveAsTextFile("output")

        sc.stop()
    }

    class KissPartitioner extends Partitioner {
        override def numPartitions: Int = 4

        override def getPartition(key: Any): Int = key match {
            case "lss" => 0
            case "yjy" => 1
            case "lxy" => 2
            case _ => 3
        }
    }
}
