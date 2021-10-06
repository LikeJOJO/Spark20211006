package bean;

import java.io.Serializable;

public class Student implements Serializable {
    public String name = "zhangsan";
    public Integer age = 30;

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
