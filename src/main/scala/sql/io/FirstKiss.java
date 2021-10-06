package sql.io;

import java.io.File;

public class FirstKiss {
    public static void main(String[] args) {
        File dir = new File("/Users/apple/Downloads/Scala数据结构和算法相关资料");
        listSubFiles(dir);
    }

    public static void listSubFiles(File dir) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    listSubFiles(file);
                }
            }
        }
        System.out.println(dir);
    }
}
