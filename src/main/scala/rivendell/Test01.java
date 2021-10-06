package rivendell;

import org.junit.jupiter.api.Test;

public class Test01 {
    public static void main(String[] args) {

    }

    @Test
    public void run03() {
        Beauty beauty = new Beauty();
        // Beauty static
        // Beauty non1 static
        // Beauty non2 static
    }

    @Test
    public void run02() {
        System.out.println(Beauty.age);
        // 16
    }

    @Test
    public void run01() {
        System.out.println(Beauty.name);
        // Beauty static
        // ly
    }
}

class Beauty {
    public static String name = "ly";
    public static final int age = 16;

    {
        System.out.println("Beauty non1 static");
    }

    static {
        System.out.println("Beauty static");
    }

    {
        System.out.println("Beauty non2 static");
    }
}
