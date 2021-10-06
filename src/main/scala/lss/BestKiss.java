package lss;

public class BestKiss {
    public static void main(String[] args) {
//        AAA aaa = new AAA();
//        aaa.love();//9
//        BBB bbb = new BBB();
//        bbb.love();//18
//        AAA ccc = new BBB();
//        ccc.love();

        new DDD().run01();

        XXX[] xxxes = new XXX[5];
        xxxes[0] = new YYY();
        xxxes[1] = new DDD();
    }
}

class AAA {
    public int i = 9;
    public int get() {
        return i;
    }
    public void love() {
        System.out.println(get() + i);
    }
}

class BBB extends AAA {
    public int i = 18;
//    public void love() {
//        System.out.println(i);
//    }
public int get() {
    return i;
}
}

interface XXX {
    public void run01();
}

class YYY implements XXX {

    @Override
    public void run01() {
        System.out.println("YYY");
    }
}

class DDD extends YYY {

}