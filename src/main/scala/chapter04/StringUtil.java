package chapter04;

public class StringUtil {
    public static boolean isNotEmpty( String s ) {
        return s != null && !s.trim().equals("");
    }
    public static boolean isEmpty( String s ) {
        //return s == null || s.trim().equals("");
        return !isNotEmpty(s);
    }
}
