package Distributed

class Task {
    var num: Int = _
    var func: (Int) => Int = _

    def Com()= {
        func(num)
    }
}
