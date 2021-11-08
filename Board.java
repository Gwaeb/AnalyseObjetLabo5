public class Board {
    private String[] boardData = { " ", " ", " ", " ", " ", " ", " ", " ", " " };
    private String espace = "    ";

    // Show the board
    public void ShowBoard() {

        System.out.println("\n" + espace + " 1   2   3");
        System.out.println("\nA" + espace + boardData[0] + " | " + boardData[1] + " | " + boardData[2]);
        System.out.println(espace + " ----------");
        System.out.println("B" + espace + boardData[3] + " | " + boardData[4] + " | " + boardData[5]);
        System.out.println(espace + " ----------");
        System.out.println("C" + espace + boardData[6] + " | " + boardData[7] + " | " + boardData[8] + "\n");
    }

    // Check if the selected square id free
    public boolean IsSquareFree(String square) {
        switch (square) {
        case "A1":
            if (boardData[0].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "A2":
            if (boardData[1].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "A3":
            if (boardData[2].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "B1":
            if (boardData[3].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "B2":
            if (boardData[4].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "B3":
            if (boardData[5].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "C1":
            if (boardData[6].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "C2":
            if (boardData[7].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;

        case "C3":
            if (boardData[8].compareTo(" ") == 0) {
                return true;
            }
            System.out.println("The case is not free");
            return false;
        default:
            return false;
        }

    }

    // Set the player symbol in his selected square
    public void SetSquare(String square, String symbol) {
        switch (square) {
        case "A1":
            boardData[0] = symbol;
            break;
        case "A2":
            boardData[1] = symbol;
            break;
        case "A3":
            boardData[2] = symbol;
            break;
        case "B1":
            boardData[3] = symbol;
            break;
        case "B2":
            boardData[4] = symbol;
            break;
        case "B3":
            boardData[5] = symbol;
            break;
        case "C1":
            boardData[6] = symbol;
            break;
        case "C2":
            boardData[7] = symbol;
            break;
        case "C3":
            boardData[8] = symbol;
            break;
        default:

        }

    }

    // Check if a play won the game
    public boolean GameIsWin(int nbOfTurn) {

        // A
        if (boardData[0].compareTo(boardData[1]) == 0 && boardData[1].compareTo(boardData[2]) == 0
                && boardData[0].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[0] + " ** ** **");
            return true;
        }
        // B
        if (boardData[3].compareTo(boardData[4]) == 0 && boardData[4].compareTo(boardData[5]) == 0
                && boardData[3].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[3] + " ** ** **");
            return true;
        }
        // C
        if (boardData[6].compareTo(boardData[7]) == 0 && boardData[7].compareTo(boardData[8]) == 0
                && boardData[8].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[6] + " ** ** **");
            return true;
        }

        // 1
        if (boardData[0].compareTo(boardData[3]) == 0 && boardData[3].compareTo(boardData[6]) == 0
                && boardData[6].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[0] + " ** ** **");
            return true;
        }
        // 2
        if (boardData[1].compareTo(boardData[4]) == 0 && boardData[4].compareTo(boardData[7]) == 0
                && boardData[7].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[1] + " ** ** **");
            return true;
        }
        // 3
        if (boardData[2].compareTo(boardData[5]) == 0 && boardData[5].compareTo(boardData[8]) == 0
                && boardData[8].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[2] + " ** ** **");
            return true;
        }

        // \
        if (boardData[0].compareTo(boardData[4]) == 0 && boardData[4].compareTo(boardData[8]) == 0
                && boardData[8].compareTo(" ") != 0) {
            System.out.println("\n\n** ** ** The winner is " + boardData[0] + " ** ** **");
            return true;
        }
        // /
        if (boardData[2].compareTo(boardData[4]) == 0 && boardData[4].compareTo(boardData[6]) == 0
                && boardData[6].compareTo(" ") != 0) {
            System.out.println("** ** ** The winner is " + boardData[2] + " ** ** **");
            return true;
        }

        // Game TIE
        if (nbOfTurn == 9) {
            System.out.println("TIE");
            return true;
        }

        // Game not finished
        return false;
    }
}