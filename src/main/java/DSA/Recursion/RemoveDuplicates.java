package DSA.Recursion;

public class RemoveDuplicates {
    public static String removeDuplicatesWorker(String prefix, String remaining) {
        String newPrefix = "";
        String newRemaining = "";
        if (remaining.length() == 1) return prefix + remaining;
        if (remaining.charAt(0) == remaining.charAt(1)) {
            newPrefix = prefix + "";
            
            newRemaining = prefix.charAt(prefix.length() - 1) + remaining.substring(2);
            return removeDuplicatesWorker(newPrefix, newRemaining);
        } else {
            newPrefix = prefix + remaining.charAt(0);
            newRemaining = remaining.substring(1);
            return removeDuplicatesWorker(newPrefix, newRemaining);
        }
    }

    public static String removeDuplicates(String str) {
        return removeDuplicatesWorker("", str);
    }

    public static void main(String[] args) {
        String str = "dbaabdab";
        System.out.println(removeDuplicates(str));
    }
}
