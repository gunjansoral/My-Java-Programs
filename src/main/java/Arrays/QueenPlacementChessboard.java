package Arrays;

public class QueenPlacementChessboard {
    //Searching
    private static boolean searchWorker(int[] arr, int key, int low, int high) {
        if (low > high) return false;
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) return true;
        for (int i = low; i < high; i++) {
            if (arr[mid] < key) {
                return searchWorker(arr, key, mid + 1, high);
            } else {
                return searchWorker(arr, key, low, mid - 1);
            }
        }
        return false;
    }

    private static boolean search(int[] arr) {
        return searchWorker(arr, 1, 0, arr.length - 1);
    }

    private static boolean nQueenUtil(int[][] arr, int col) {
        return true;
    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean nQueen() {
        int chessBoard[][] = {{0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        if (!nQueenUtil(chessBoard, 0)) {
            System.out.print("Solution does not exist");
            return false;
        }
        printArr(chessBoard);
        return true;
    }

    public static void main(String[] args) {
        nQueen();
    }
}
