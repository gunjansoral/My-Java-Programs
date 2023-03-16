package Games.TowerOfHanoi;

public class Stack {
    //attributes
    private int n;
    private int[] arr;
    //constructor
//    public Stack(int n) {
//        this.n = n;
//        arr = new int[n];
//    }
    //behaviours
    public void push(int num) {
        if(num <= 0) return;
        if(this.n <= 0) return;
        for(int i = 0; i<n; i++) {
            if(this.arr[i] == 0) {
                arr[i] = num;
                return;
            }
        }
    }
    public void pop() {
        if(this.n <= 0) return;
        for( int i = 0; i<n; i++) {
            if(this.arr[i] == 0) {
                arr[i-1] = 0;
                return;
            }
        }
    }
    public void print() {
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
