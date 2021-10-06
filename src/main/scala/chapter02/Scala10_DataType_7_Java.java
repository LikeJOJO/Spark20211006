package chapter02;

public class Scala10_DataType_7_Java {
    public static void main(String[] args) {

        int i = 128;
        byte b = (byte)i;

        // 0000 0000 0000 0000 0000 0000 1000 0000
        //                               1000 0000
        // ======================================
        // 1 + 000 0000 => (-)(000 0000) => (-)(min) => 8bit(-min) => -128
        // 1 + 111 1111 => (-)(111 1111) => (-)(max) => 8bit(-max) => -1
        // 10000000 + 1 => 1000 0001
        System.out.println(b);

        // -127 (3)
        // 127  (1)
        // -128 (2)

        String s = "abc";
        s.charAt(0);
    }

}
