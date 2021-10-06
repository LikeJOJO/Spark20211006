package chapter02;

import java.lang.reflect.Field;

public class Scala04_Var_String {
    public static void main(String[] args) throws Exception{

        // TODO 字符串
        // 不可变 : String
        //          String是不可变字符串，所以没有提供任何的方法多本身内容进行修改
        //          所有修改内容的方法都是产生新的字符串。
        //          如果非要改，可以采用特殊的方式进行修改，反射
        // 可变 :  StringBuilder, StringBuffer
        String s = " a b ";
        //s = s.trim(); // 去首尾半角空格
        //System.out.println("!"+s+"!");
        // !a b! (X)
        // ! a b ! (OK)

        final Field value = String.class.getDeclaredField("value");
        // get方法在反射中表示获取某个对象的属性值
        value.setAccessible(true);
        final char[] cs = (char[])value.get(s);
        cs[2] = 'd';

        System.out.println(s);

    }
}
