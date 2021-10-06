package playground;

import java.util.ArrayList;
import java.util.List;

public class PlayJava {
    public static void main(String[] args) {

        User user = new User();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "zhangsan";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "lisi";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(user.name);
            }
        });

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕");
        // main方法执行完毕
        // zhangsan
        // lisi

    }
    static StringBuilder ss = new StringBuilder();
    public static String test() {
        //String s = "";

        for ( int i = 0; i < 10000000; i++ ) {
            ss.append(i);
        }
        return ss.toString();
    }
}
class User {
    public String name;
}
