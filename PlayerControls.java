public class PlayerControls {
    private String symbol;
    // private String nextSquare;
    // private Scanner scanner = new Scanner(System.in);
    private String[] possibilities = { "A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3" };

    // Get symbol
    public String Symbol() {
        return symbol;
    }

    // Constructor
    public PlayerControls(String s) {
        this.symbol = s.toUpperCase();
    }

    // Player action during his turn
    public boolean NextMove(String move) {

        for (int i = 0; i < 9; i++) {
            if (move.toUpperCase().compareTo(possibilities[i]) == 0) {
                return true;
            }
        }
        System.out.println("\nUnknown square. Please take a valid one. \n\n");
        return false;
    }
}
