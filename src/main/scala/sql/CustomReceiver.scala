import org.apache.spark.SparkConf
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.dstream.ReceiverInputDStream
import org.apache.spark.streaming.receiver.Receiver

import java.util.Random
import java.util.concurrent.TimeUnit

object CustomReceiver {
    def main(args: Array[String]): Unit = {

        val sparkConf = new SparkConf().setMaster("local[2]").setAppName("Streaming")
        val ssc = new StreamingContext(sparkConf, Seconds(3))

        val ds: ReceiverInputDStream[String] = ssc.receiverStream( new MyDataSourceReceiver() )

        ds.print()

        ssc.start()
        ssc.awaitTermination()
    }
    // 自定义数据源（采集器）
    // 1. 继承Receiver类, 定义存储数据的类型以及数据存储的级别
    // 2. 重写方法
    class MyDataSourceReceiver extends Receiver[String](StorageLevel.MEMORY_ONLY){
        private var flag = true
        override def onStart(): Unit = {
            while ( flag ) {
                // 准备数据（采集数据）
                val name = "zhangsan" + new Random().nextInt(10)
                // 存储数据
                store(name)
                TimeUnit.MILLISECONDS.sleep(500)
            }

        }

        override def onStop(): Unit = {
            flag = false
        }
    }
}
