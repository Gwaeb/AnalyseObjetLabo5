public class Turn {

    private String turnSymbol;
    private int nbOfTurn = 0;

    // Get turnSymbol
    public String TurnSymbol() {
        return turnSymbol;
    }

    // Get nbOfTurn
    public int NbOfTurn() {
        return nbOfTurn;
    }

    // Constructor
    public Turn() {
        this.turnSymbol = "X";
    }

    public void NextTurn() {
        if (this.turnSymbol.toUpperCase().compareTo("X") == 0) {
            this.turnSymbol = "O";
            nbOfTurn++;
        } else {
            this.turnSymbol = "X";
            nbOfTurn++;
        }
    }
}
