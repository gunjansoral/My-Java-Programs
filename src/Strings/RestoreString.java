package Strings;

public class RestoreString {
    public static String restoreString(String s, int[] indices) {
        String str = "";
        for(int i=0; i<indices.length; i++) {
            str = str.concat(s.valueOf(s.charAt(indices[i])));
        }
        return str;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.print(restoreString("codeleet", arr));
    }
}
