package sql.threadTest;

public class FunctionalInterface02 {
    public static void main(String[] args) {
        Like l = (name, age) -> {return name + " is " + age + " years old.";};
        System.out.println(l.girl("chj", 16));
    }
}

@FunctionalInterface
interface Like {
    public String girl(String name, int age);
}

