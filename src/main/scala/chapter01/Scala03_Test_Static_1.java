package chapter01;

import com.atguigu.bigdata.scala.bean.Emp;

public class Scala03_Test_Static_1 {
    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

        // sleep方法和wait方法的字体不一样
        // sleep方法是静态方法，wait方法是成员方法
        Thread.sleep(1000); // t1不会休眠，main线程休眠，不能释放对象锁
        t2.wait(); // t2线程在等待，可以释放对象锁
    }
}
