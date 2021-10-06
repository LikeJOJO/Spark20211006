import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}

object utdf {
    def main(args: Array[String]): Unit = {
        // 创建环境
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("SparkSQL")
        val spark = SparkSession.builder().config(sparkConf).getOrCreate()
        import spark.implicits._

        // RDD
        val rdd = spark.sparkContext.makeRDD(
            List(
                (1,"zhangsan",30),
                (2,"lisi",40),
                (3,"wangwu",50)
            )
        )

        // RDD => DataFrame
        val df: DataFrame = rdd.toDF("id", "name", "age")

        // Name : zhangsan
        // Name : lisi
        // Name : wangwu

        df.createOrReplaceTempView("user")

        // 用户自定义函数
        spark.udf.register(MyFunction.fun01, (name:String)=>{
            "Name : " + name
        })

        spark.sql(s"select id, ${MyFunction.fun01}(name), age from user").show

        // 关闭环境
        spark.stop()
    }
}

object MyFunction extends Enumeration {
    val fun01 = "prefixName"
}
