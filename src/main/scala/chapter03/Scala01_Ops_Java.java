package chapter03;

public class Scala01_Ops_Java {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

//        System.out.println(s1 == s2); // true
//        System.out.println(s1 == s3); // false
//        System.out.println(s1.equals(s3)); // true

        // 装箱功能 ： Integer.valueOf
        Integer i1 = 200;
        Integer i2 = 200;

        // 所有的包装类型的比较不能使用双等号
        //System.out.println(i1.equals(i2));

        byte b = 127;
        b++;
        System.out.println(b);

    }
}
