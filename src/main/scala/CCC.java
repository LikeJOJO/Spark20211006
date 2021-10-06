public class CCC {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        a.clone();
        /*
        方法的提供者和调用者之间的关系
        java.lang.Object

         */
    }
}

class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
