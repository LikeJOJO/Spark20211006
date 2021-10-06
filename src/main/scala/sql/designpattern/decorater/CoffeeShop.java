package sql.designpattern.decorater;

public class CoffeeShop {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("Pure coffee: " + order.cost());
        System.out.println(order.getDes());

        order = new Milk(order);
        System.out.println("coffee & milk: " + order.cost());
        System.out.println(order.getDes());

        order = new Chocolate(order);
        System.out.println("coffee & milk & chocolate: " + order.cost());
        System.out.println(order.getDes());

        order = new Soy(order);
        System.out.println("coffee & milk & chocolate & soy: " + order.cost());
        System.out.println(order.getDes());
    }
}
