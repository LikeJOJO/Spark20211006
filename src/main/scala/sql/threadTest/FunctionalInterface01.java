package sql.threadTest;

public class FunctionalInterface01 {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void sayHello() {
                System.out.println("chj");
            }
        };
        foo.sayHello();

        Foo foo1 = () -> {System.out.println("chj");};
        foo1.sayHello();
    }
}
@FunctionalInterface
interface Foo {
    public void sayHello();
}
