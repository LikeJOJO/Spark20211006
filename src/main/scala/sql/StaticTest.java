import org.apache.hadoop.util.hash.Hash;

import java.util.*;

public class StaticTest {
    public static void main(String[] args) {
        new Solution02().firstUniqChar("dxylovesdh");
    }
}

class Solution02 {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        if (map.size() == s.length()) {
            return -1;
        } else {

        }
        return -1;
    }
}

class Solution01 {
    public int firstUniqChar(String s) {
        HashSet<String> set = new HashSet<>();
        String temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.substring(i, i + 1);
            if (!set.contains(temp) && !(s.substring(i + 1).contains(temp))) {
                return i;
            } else {
                set.add(temp);
            }
        }
        return -1;
    }
}