package sql.designpattern.decorater;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" Milk ");
        setPrice(2f);
    }
}
