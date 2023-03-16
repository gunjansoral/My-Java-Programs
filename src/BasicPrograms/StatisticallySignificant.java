package BasicPrograms;

import java.sql.SQLOutput;

public class StatisticallySignificant {
    public static String[] confidence(double zscore) {
        int[] percentage = {90, 95, 98, 99};
        double[] confidence = {1.645, 1.96, 2.326, 2.756};
        String[] str = new String[confidence.length];
        for (int i = 0; i < confidence.length; i++) {
            str[i] = zscore >= confidence[i] ? "for " + percentage[i] + " yes" : "for " + percentage[i] + " no";
        }
        return str;
    }

    public static void main(String[] args) {
        String[] arr = confidence(2.125);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
