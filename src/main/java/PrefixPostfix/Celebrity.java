package PrefixPostfix;

public class Celebrity {
    public static boolean knows(int[][] party, int a, int b) {
        return party[a][b] == 1;
    }

    public static int knowTheCelebrity(int[][] party) {
        for (int col = 0; col < party.length; col++) {
            boolean isCeleb = true;
            for (int row = 0; row < party[col].length; row++) {
                if (row == col) continue;
                if (knows(party, row, col) == false) {
                    isCeleb = false;
                    break;
                }
            }
            if (isCeleb) {
                return col;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] party = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
        };
        System.out.println(knowTheCelebrity(party));
    }
}
