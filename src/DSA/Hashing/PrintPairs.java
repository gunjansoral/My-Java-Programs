package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class PrintPairs {
    public static void main(String[] args) {
        String[] names = {"gunjan", "rahul", "arun", "aman"};
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(i, names[i]);
        }
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
