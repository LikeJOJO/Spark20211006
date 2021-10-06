import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object TupleTest {
    def main(args: Array[String]): Unit = {
        // 创建Spark运行配置对象。local在当前本地环境而非分布式环境中
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")

        // 创建Spark上下文环境对象（连接对象）
        val sc : SparkContext = new SparkContext(sparkConf)

        // 读取文件数据
        val fileRDD: RDD[String] = sc.textFile("data/beauty.txt")

        // 将文件中的数据进行分词
        val wordRDD: RDD[String] = fileRDD.flatMap(
            k => {
                println("Apple")
                k.split(" ")
            }
        )

        // 转换数据结构 word => (word, 1)。这里跟一开始写的时候用groupBy的区别感受一下
        val word2OneRDD: RDD[(String, Int)] = wordRDD.map((_,1))

        // 将转换结构后的数据按照相同的单词进行分组聚合
        val word2CountRDD: RDD[(String, Int)] = word2OneRDD.reduceByKey(_+_)

        // 将数据聚合结果采集到内存中。前面封装的一大堆都不会执行，只是在一层层封装。collect这里才会开始执行。试着把下面这一句注释掉，会发现上面什么都不打印
        val word2Count: Array[(String, Int)] = word2CountRDD.collect()

        // 打印结果
        word2Count.foreach(println)

        //关闭Spark连接
        sc.stop()
    }
}
