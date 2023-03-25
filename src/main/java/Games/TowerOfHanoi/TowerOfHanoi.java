package Games.TowerOfHanoi;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Board newBoard = new Board(6);
        newBoard.A.push(4);
        newBoard.print();
    }
}
