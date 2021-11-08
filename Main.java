import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameControls g = new GameControls();
        g.Initialize();

        String move;
        Boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (playAgain) {
            System.out.println("\n\n -------- NEW GAME -------- \n\n");
            do {

                g.Board().ShowBoard();
                if (g.Turn().TurnSymbol().compareTo("X") == 0) {
                    do {
                        do {
                            System.out.println("\nWhat is your next move? (A1, A2, A3, B1, B2, B3, C1, C2, C3)");
                            move = scanner.nextLine().toUpperCase();
                        } while (!g.P1().NextMove(move));
                    } while (!g.Board().IsSquareFree(move));
                    g.Board().SetSquare(move.toUpperCase(), g.P1().Symbol());
                } else {
                    do {
                        do {
                            System.out.println("\nWhat is your next move? (A1, A2, A3, B1, B2, B3, C1, C2, C3)");
                            move = scanner.nextLine().toUpperCase();
                        } while (!g.P2().NextMove(move));
                    } while (!g.Board().IsSquareFree(move));
                    g.Board().SetSquare(move.toUpperCase(), g.P2().Symbol());

                }
                g.Turn().NextTurn();
            } while (!g.Board().GameIsWin(g.Turn().NbOfTurn()));
            g.Board().ShowBoard();

            System.out.println("\n\n Do you want ot play again? O/N");
            choice = scanner.nextLine();
            if (choice.toUpperCase().compareTo("O") == 0) {
                g.Initialize();
            } else {
                playAgain = false;
            }
        }

        scanner.close();
    }
}
