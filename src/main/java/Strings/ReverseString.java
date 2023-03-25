package Strings;

public class ReverseString {
    public static String reverse(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }

    public static void main(String[] args) {
        String str = "hello";
        String newStr = reverse(str);
        System.out.print(newStr);
    }
}
