import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

public class AAA {
    public static void main(String[] args) throws IOException {
        //copy("/Users/apple/Downloads/girl.txt", "/Users/apple/Downloads/gir2.txt");
        //copy("/Users/apple/Downloads/day1027_11缓存IO流.avi", "/Users/apple/Downloads/day1027_11缓存IO流2.avi");
        System.out.println(recursion(9));
    }

    public static void readFile()  throws IOException {
        FileInputStream fis = new FileInputStream("/Users/apple/Downloads/girl.txt");
        byte[] data = new byte[20];
        int len;
        while ((len = fis.read(data)) != -1) {
            System.out.println(new String(data, 0, len, StandardCharsets.UTF_8));
        }
        fis.close();
    }

    public static void writeFile() throws IOException {
        String str = "Google";
        FileOutputStream fos = new FileOutputStream("/Users/apple/Downloads/beauty.txt", true);
        fos.write(str.getBytes());
        fos.close();
    }

    public static void readChar() throws IOException {
        FileReader fr = new FileReader("/Users/apple/Downloads/girl.txt");
        char[] data = new char[10];
        int len;
        while ((len = fr.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }
        fr.close();
    }

    public static void writeChar() throws IOException {
        String str = "好的";
        FileWriter fw = new FileWriter("", true);
        fw.write(str);
        fw.close();
    }

    public static void copy(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] data = new byte[1024];
        int len;
        while ((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }

        fos.close();
        fis.close();
    }

    public static int recursion(int n) {
        return (n == 1) ? 1 : (n + recursion(n-2));
    }
}

