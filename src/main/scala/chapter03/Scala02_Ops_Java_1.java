package chapter03;

public class Scala02_Ops_Java_1 {
    public static void main(String[] args) {

        // TODO 阶乘 : 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1
        // StackOverflowError : 栈滚动错误
        int result = test(5); // 120
        System.out.println(result);
    }
    // 阶乘
    public static int test( int num ) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * test(num-1);
        }
    }
}
