package action

import org.apache.spark.{SparkConf, SparkContext}

object aggregate {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val rdd = sc.makeRDD(List(1, 2, 3, 4), 8)

        // KISS 8个分区，4个分区有值，4个分区为空。所以有值的每个分区都要加上zeroValue，空的分区因为没值所以就是zeroValue，而且aggregate跟aggregateByKey不一样，它自身也是参与运算的
        println(rdd.aggregate(0)(_ + _, _ + _)) //10
        println(rdd.aggregate(3)(_ + _, _ + _)) //37
        println(rdd.aggregate(10)(_ + _, _ + _)) //100


        val rdd1 = sc.makeRDD(List(1, 2, 3, 4), 2)

        println(rdd1.aggregate(0)(_ + _, _ + _)) //10
        println(rdd1.aggregate(3)(_ + _, _ + _)) //19
        println(rdd1.aggregate(10)(_ + _, _ + _)) //40
        sc.stop()

    }
}
