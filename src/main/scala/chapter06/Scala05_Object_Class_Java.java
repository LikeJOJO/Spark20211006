package chapter06;

public class Scala05_Object_Class_Java {
    public static void main(String[] args) throws Exception {

        // 访问权限 ：方法的提供者和方法调用者之间的关系
        // 点不是调用的意思，是从属关系
        // 方法的提供者：java.lang.Object
        // 方法的调用者：com.atguigu.bigdata.scala.chapter06.Scala05_Object_Class_Java
        A a = new A();
        // A对象 的 clone方法
        a.clone();
    }
}
class A {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
