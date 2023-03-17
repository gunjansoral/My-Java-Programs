package Arrays;

import java.util.*;
import java.util.Scanner;

public class RepeatingAndMissingNumbers {
    static void findRepeatingAndMissing(int[] arr, int size) {
        int repeatingNum = 0;
        int missingNum = 0;
        int repeatCount = 0;
        int[] temp = new int[size + 1];
        //fill temp with count values from 0 to size - 1
        int count = 1;
        //initialise temp
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        //change temp values
        for (int i = 0; i < size; i++) {
            if (temp[arr[i]] != 0) {
                temp[arr[i]]++;
            } else {
                temp[arr[i]] = 1;
            }
        }
        //check repeating value
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                repeatingNum = i;
            }
        }
        //check missing value
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0) {
                missingNum = i;
            }
        }
        System.out.println("Repeating no is : [" + repeatingNum + "]");
        System.out.println("Missing no is : [" + missingNum + "]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //int[] arr1 = {3, 4, -5, 1, 6};
        findRepeatingAndMissing(arr, n);
    }
}
