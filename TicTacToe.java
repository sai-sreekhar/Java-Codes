import java.util.*;

public class TicTacToe {

    static String[] ticTacToeBoard;
    static String currentPlayer;

    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String l = null;

            switch (i) {
                case 0:
                    l = ticTacToeBoard[0] + ticTacToeBoard[1] + ticTacToeBoard[2];
                    break;
                case 1:
                    l = ticTacToeBoard[3] + ticTacToeBoard[4] + ticTacToeBoard[5];
                    break;
                case 2:
                    l = ticTacToeBoard[6] + ticTacToeBoard[7] + ticTacToeBoard[8];
                    break;
                case 3:
                    l = ticTacToeBoard[0] + ticTacToeBoard[3] + ticTacToeBoard[6];
                    break;
                case 4:
                    l = ticTacToeBoard[1] + ticTacToeBoard[4] + ticTacToeBoard[7];
                    break;
                case 5:
                    l = ticTacToeBoard[2] + ticTacToeBoard[5] + ticTacToeBoard[8];
                    break;
                case 6:
                    l = ticTacToeBoard[0] + ticTacToeBoard[4] + ticTacToeBoard[8];
                    break;
                case 7:
                    l = ticTacToeBoard[2] + ticTacToeBoard[4] + ticTacToeBoard[6];
                    break;
            }
            if (l.equals("XXX")) {
                return "X";
            } else if (l.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(ticTacToeBoard).contains(
                    String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }

        System.out.println(
                currentPlayer + "'s currentPlayer; enter i slot number to place "
                        + currentPlayer + " in:");
        return null;
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + ticTacToeBoard[0] + " | "
                + ticTacToeBoard[1] + " | " + ticTacToeBoard[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + ticTacToeBoard[3] + " | "
                + ticTacToeBoard[4] + " | " + ticTacToeBoard[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + ticTacToeBoard[6] + " | "
                + ticTacToeBoard[7] + " | " + ticTacToeBoard[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ticTacToeBoard = new String[9];
        currentPlayer = "X";
        String winner = null;

        for (int i = 0; i < 9; i++) {
            ticTacToeBoard[i] = String.valueOf(i + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println(
                "X will play first. Enter the slot number to place X in:");

        while (winner == null) {
            int inputNum;
            try {
                inputNum = in.nextInt();
                if (!(inputNum > 0 && inputNum <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }
            if (ticTacToeBoard[inputNum - 1].equals(
                    String.valueOf(inputNum))) {
                ticTacToeBoard[inputNum - 1] = currentPlayer;

                if (currentPlayer.equals("X")) {
                    currentPlayer = "O";
                } else {
                    currentPlayer = "X";
                }

                printBoard();
                winner = checkWinner();
            } else {
                System.out.println(
                        "Slot already choosed; re-enter slot number:");
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw");
        }

        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
        in.close();
    }
}
