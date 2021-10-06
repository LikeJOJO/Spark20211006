package sql.designpattern.decorater;

public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes(" Chocolate ");
        setPrice(3f);
    }
}
