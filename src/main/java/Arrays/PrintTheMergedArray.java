package Arrays;
import java.util.*;

public class PrintTheMergedArray {
    public static void merge(int[] arr, int k){
        //write your code here
        int[] newArr = new int[arr.length/k];
        int temp;
        for(int i=0; i<newArr.length; i++) {
            temp = 0;
            for(int j=0; j<k; j++) {
                temp += arr[i*k+j]*Math.pow(10, k-(j+1));
            }
            newArr[i] = temp;
            System.out.println(newArr[i]);
        }
    }
    public static void main(String[] args) {
        int k,n;
        Scanner s = new Scanner(System.in);
        k = s.nextInt();
        n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        //write your code here
        merge(arr, k);
    }
}
