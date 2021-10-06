package bean;

public class User {
    // 类的属性，其实就是类的变量
    String name = "zhangsan";
    public static int age;
    static {
        age = 30;
        System.out.println("user static code ...");
    }
    public void test() {
        String name = "zhangsan";
    }
}
