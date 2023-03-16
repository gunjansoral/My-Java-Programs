package Games.TowerOfHanoi;
public class Board {
    public Tower A, B, C;
    private int totalDisks;
    public Board(int totalDisks) {
        this.totalDisks = totalDisks;
        A = new Tower(10);
        B = new Tower(10);
        C = new Tower(10);
        for(int i = this.totalDisks; i>=1; i--) {
            A.push(i);
        }
    }

    //behaviours
    public void print() {
        System.out.print("A = ");
        A.print();
        System.out.println();
        System.out.print("B = ");
        B.print();
        System.out.println();
        System.out.print("C = ");
        C.print();
        System.out.println();
    }
}
