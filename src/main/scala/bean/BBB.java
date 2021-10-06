package bean;

public class BBB extends AAA {
    public int age = 40;
    public void test() {
        // this是在运行时使用
        System.out.println(this.age);
        // super是在编译时使用
        System.out.println(super.age);
    }
}
