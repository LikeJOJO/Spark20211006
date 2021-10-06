package five

import java.text.Collator
import scala.collection.mutable

object WhiteKiss {
    def main(args: Array[String]): Unit = {
//        val tuple = List(("杨佳怡", 17), ("李苏苏", 16), ("李轶", 18), ("陈浩洁", 15))
//        println(tuple.sortBy(k => {
//            k
//            Collator.getInstance().compare()
//        }))

        class Beauty {
            var name: String = _
            var age: Int = _

            override def toString: String = s"${name} is ${age} years old."
        }

        object Beauty {
            def apply(name: String, age: Int): Beauty = {
                val beauty = new Beauty()
                beauty.name = name
                beauty.age = age
                beauty
            }
        }

        val girls = List(
            Beauty("杨佳怡", 17),
            Beauty("李苏苏", 16),
            Beauty("李轶", 18),
            Beauty("陈浩洁", 15),
            Beauty("公荣", 19)
        )

//        val value = girls.sortBy(
//            lady => {
//                (lady.name, lady.age)
//            }
//        )
        val value = girls.sortWith(
    (leftLady, rightLady) => {
        leftLady.name < rightLady.name
    }
)
        println(value)
    }
}
