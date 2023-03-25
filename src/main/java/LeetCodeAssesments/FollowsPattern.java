package LeetCodeAssesments;

import java.lang.String;
import java.util.Arrays;

public class FollowsPattern {
    public static int count = 0;

    public static String[] convertToWords(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return words;
    }

    public static int genCount() {
        count++;
        return count;
    }

    public static boolean wordPattern(String pattern, String s) {
        int len = pattern.length();
        if (s.length() < len) return false;
        String[] words = convertToWords(s);
        if (words.length != pattern.length()) return false;

        int newWordCount = 0;
        int[] p = new int[words.length];
        p[0] = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                p[i] = words[i] != words[j] ? genCount() : p[i];
            }
        }

        System.out.println(Arrays.toString(p));
        return false;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abcd", "cat. dog, dog, cat"));
    }
}
