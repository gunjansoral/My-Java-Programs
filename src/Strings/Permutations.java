package Strings;

public class Permutations {
    public static void printPermutations(String remaining, String prefix) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                printPermutations(newRemaining, newPrefix);
            }
        }
//        if (remaining.length() == 0) {
//            System.out.println(prefix);
//        } else {
//            for (int i = 0; i < remaining.length(); i++) {
//                String newPrefix = prefix + remaining.charAt(i);
//                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
//                printPermutations(newRemaining, newPrefix);
//            }
//        }
    }

    public static void main(String[] args) {
        printPermutations("AB", "");
    }
}
