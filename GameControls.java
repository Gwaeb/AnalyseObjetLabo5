public class GameControls {
    private Board b;
    private Turn t;

    private PlayerControls p1;
    private PlayerControls p2;

    // Get board
    public Board Board() {
        return b;
    }

    // Get tunr
    public Turn Turn() {
        return t;
    }

    // Get p1
    public PlayerControls P1() {
        return p1;
    }

    // Get p2
    public PlayerControls P2() {
        return p2;
    }

    public void Initialize() {
        this.b = new Board();
        this.t = new Turn();

        this.p1 = new PlayerControls("X");
        this.p2 = new PlayerControls("O");
    }

}
