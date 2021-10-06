package summer.common

import summer.util.EnvUtil
import org.apache.spark.rdd.RDD

trait TDao {
    def readFile( path:String ) = {
        val lineRDD: RDD[String] = EnvUtil.getEnv().textFile(path)
        lineRDD
    }
}
