package Strings;

public class removeAdajacentDuplicates {
//    public static String checkEvenAndConvert(String str) {
//        if(str.length()%2 == 0) return "";
//        return String.valueOf(str.charAt(0));
//    }
//    public static String sameCharStr(String str) {
//        String temp = "";
//        for(int i=1; i<str.length(); i++) {
//            if (str.charAt(i - 1) == str.charAt(i)) {
//                temp += str.charAt(i);
//            } else {
//                return temp + str.charAt(i-1);
//            }
//        }
//        return temp;
//    }
    static char c;
    public static String removeAdjacent(String str) {
        //Write your code here
        if(str.length() <= 1) return str;

        if(str.charAt(0) == str.charAt(1)) {
            c = str.charAt(0);
            while (str.length() > 1 && str.charAt(0) == str.charAt(1)) {
                str = str.substring(1);
            }
            str = str.substring(1);
            return removeAdjacent(str);
            }
        String rightStr = removeAdjacent(str.substring(1));

        if (rightStr.length() != 0 && rightStr.charAt(0) == str.charAt(0)) {
            c = str.charAt(0);
            return rightStr.substring(1);
        }

        if (rightStr.length() == 0 && c == str.charAt(0))
            return rightStr;

        return (str.charAt(0) + rightStr);
    }
    public static void main(String[] args) {
        String str = "aadbbddddgggghf";
        System.out.println(removeAdjacent(str));
    }
}
