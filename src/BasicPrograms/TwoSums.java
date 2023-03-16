package BasicPrograms;
import java.util.Scanner;
public class TwoSums {
    public static int[] twoSum(int[] num, int target) {
        int[] newArr = new int[2];
        newArr[0] = 0;
        newArr[1] = 0;
        for(int i = 0; i<num.length; i++) {
            for(int j = 0; j<num.length; j++) {
                if(i == j) continue;
                if(num[i] + num[j] == target) {
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] Sum = twoSum(arr, target);
        System.out.print("[ " + Sum[0] + ", " + Sum[1] + " ]1" );
    }
}
