package sql.designpattern.decorater;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes(" Soy ");
        setPrice(1.5f);
    }
}
