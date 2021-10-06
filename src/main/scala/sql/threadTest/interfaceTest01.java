package sql.threadTest;

public class interfaceTest01 {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface InterTest01 {
    void fun01(String name);

    default double div(double a, double b) {
        return a / b;
    }

    default double add(double a, double b) {
        return a + b;
    }

    default double minus(double a, double b) {
        return a - b;
    }

    static void show01() {

    }

    static void show02() {

    }
}
