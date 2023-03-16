package Strings;

public class NumberOfVovelsAndConsonents {
    public static String count(String str) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'a' || str.charAt(i) == 'A'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'U')
                vowels++;
            else if (str.charAt(i) == ' ')
                continue;
            else
                consonants++;
        }
        return "Vowels " + vowels + " ,Consonants " + consonants;
    }

    public static void main(String[] args) {
        System.out.println(count("abcdefghijklmnopqrstuvwxyz"));
    }
}
