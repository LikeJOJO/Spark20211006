package chapter01;

import com.atguigu.bigdata.scala.bean.Emp;

public class Scala04_Test_Final {
    public static void main(String[] args) {

        // 使用final修饰的变量的值不能发生改变，所以这个变量其实是不可变变量
        //final String s = "abc";

        //final char c = 'A';
        //char c1 = c + 1;

        // 编译时，常量可以直接计算
        //char c2 = 'A' + 1;

        int age = 10 + 10 + 10;

        System.out.println(age);

    }
}
