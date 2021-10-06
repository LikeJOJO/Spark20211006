package third

object Province {
    def main(args: Array[String]): Unit = {
//        val datas = List(
//            ("hello", "A", "1"),
//            ("hello", "A", "2"),
//            ("hello", "C", "1"),
//            ("hello", "B", "3"),
//            ("hello", "A", "1"),
//        ).groupBy(s => s._2 + "-" + s._3).map(k => (k._1, k._2.size)).map(n => {
//            val a = n._1.split("-")
//            (a(0), a(1), n._2)
//        }).groupBy(_._1).map(m => {
//            (m._1, m._2)
//        })
val datas = List(
    ("hello", "A", "1"),
    ("hello", "A", "2"),
    ("hello", "C", "1"),
    ("hello", "B", "3"),
    ("hello", "A", "1"),
).groupBy(s => s._2 + "-" + s._3).map(k => (k._1, k._2.size)).map(n => {
    val a = n._1.split("-")
    List(a(0), a(1), n._2)
}).groupBy(_(0)).map(m => m)
println(datas)
    }
}
