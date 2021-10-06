package chapter03;

public class Scala04_Ops_Java {
    public static void main(String[] args) {
        //1;
        new Object();
        // 空指针异常：访问一个为null(空)对象的成员方法或成员属性，会产生空指针异常
        //Person p = new Person();
        // Integer => int
        // 插箱原理：Integer.intValue
        //test(p.age);

        java.util.List list = null;

        // List.iterator
        for ( Object obj : list ) {
            System.out.println(obj);
        }
    }
    public static void test( int age ) {
        System.out.println(age);
    }
}
class Person {
    public static Integer age;
}
