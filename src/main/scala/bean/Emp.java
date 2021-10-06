package bean;

public class Emp {

    public final static int age;
    public final String name;
    public Emp() {
        name = "zhangsan";
    }
    {

    }
    static {
        age = 30;
        System.out.println("emp static code ...");
    }
}
