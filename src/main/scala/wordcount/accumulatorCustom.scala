package wordcount

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.util.AccumulatorV2

object accumulatorCustom {
    def main(args: Array[String]): Unit = {
        val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Apple")
        val sc: SparkContext = new SparkContext(sparkConf)

        val acc1 = new CustomAccumulator1()
        sc.register(acc1, "acc1")
        val list1 = sc.makeRDD(List(1, 3, 5, 7, 9))
        list1.foreach(
            k => {
                acc1.add(k)
            }
        )
        println(acc1.value)

        val acc2 = new CustomAccumulator2()
        sc.register(acc2, "acc2")
        val list2 = sc.makeRDD(List(("a", 2), ("b", 1), ("c", 2), ("b", 2)))
        list2.foreach(
            t => {
                acc2.add(t)
            }
        )
        println(acc2.value)

        val acc3 = new CustomAccumulator3()
        sc.register(acc3, "acc3")
        val list3 = sc.makeRDD(List(Human("a", 2), Human("b", 1), Human("c", 2), Human("b", 2)))
        list3.foreach(
            t => {
                acc3.add(t)
            }
        )
        println(acc3.value)

        sc.stop()
    }

    class CustomAccumulator1 extends AccumulatorV2[Int, Int] {
        private var sum: Int = 0
        // 判断当前累加器是否初始化
        override def isZero: Boolean = {
            sum == 0
        }
        // 复制累加器
        override def copy(): AccumulatorV2[Int, Int] = {
            new CustomAccumulator1
        }
        // 重置累加器
        override def reset(): Unit = {
            sum = 0
        }
        // 将累加器外部的值输入到累加器中（采集）
        override def add(v: Int): Unit = {
            sum += v
        }
        // 合并多个累加器的值。这一步理论上应该在Driver端发生
        override def merge(other: AccumulatorV2[Int, Int]): Unit = {
            sum += other.value
        }
        // 返回累加器的结果
        override def value: Int = {
            sum
        }
    }

    class CustomAccumulator2 extends AccumulatorV2[(String, Int), Int] {
        private var sum: Int = 0

        override def isZero: Boolean = {
            sum == 0
        }

        override def copy(): AccumulatorV2[(String, Int), Int] = {
            new CustomAccumulator2
        }

        override def reset(): Unit = {
            sum = 0
        }

        override def add(v: (String, Int)): Unit = {
            sum += v._2
        }

        override def merge(other: AccumulatorV2[(String, Int), Int]): Unit = {
            sum += other.value
        }

        override def value: Int = sum
    }

    class CustomAccumulator3 extends AccumulatorV2[Human, Int] {
        private var sum: Int = 0

        override def isZero: Boolean = {
            sum == 0
        }

        override def copy(): AccumulatorV2[Human, Int] = {
            new CustomAccumulator3
        }

        override def reset(): Unit = {
            sum = 0
        }

        override def add(v: Human): Unit = {
            sum += v.age
        }

        override def merge(other: AccumulatorV2[Human, Int]): Unit = {
            sum += other.value
        }

        override def value: Int = {
            sum
        }
    }

    case class Human(var name: String, var age: Int)
}
