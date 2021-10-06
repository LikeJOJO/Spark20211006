package com.atguigu.bigdata.scala.bean

// 类需要序列化
class Task extends Serializable {

    var start : Int = 0
    var end : Int = 0
    var logic : (Int, Int)=>Unit = null

    // 计算
    def compute(): Unit = {
        logic(start, end)
    }
}
