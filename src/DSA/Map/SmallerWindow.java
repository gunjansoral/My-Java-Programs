package DSA.Map;

import java.util.*;

public class SmallerWindow {
    public static String smallerWindow(String str) {
        int smallestWindowSize = str.length();
        Map map = new HashMap<Character, Integer>();
        String ans = "";
        char[] chr = str.toCharArray();
        for (char ch : chr) {
            map.put(ch, 1);
        }
        int distCount = map.size();
        String smallestWindowStr = "";
        Map mapWindow = null;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                mapWindow = new HashMap<Character, Integer>();
                for (int k = i; k <= j; k++) {
                    mapWindow.put(str.charAt(k), 1);
                }
                if (map.size() == mapWindow.size()) {
                    int currentWindowSize = j - i + 1;
                    if (currentWindowSize < smallestWindowSize) {
                        smallestWindowSize = currentWindowSize;
                        smallestWindowStr = str.substring(i, j + 1);
                    }
                }
            }
        }
        return smallestWindowStr;
    }
}
