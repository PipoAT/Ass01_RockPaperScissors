import java.util.Scanner; // import scanner for user input

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // initialize scanner for users input
        Scanner playerOne = new Scanner(System.in);
        Scanner playerTwo = new Scanner(System.in);
        Scanner playAgain = new Scanner(System.in);

        // initialize variables
        String playerOneMove = ""; // string to store the move for player one
        String playerTwoMove = ""; // string to store the move for player two
        String playAgainInput = ""; // string to store if players want to play again

        // do while loop in place to ensure the game continues to run until an N is received
        do {

            // clear out player one's move to ensure new entry can be read
            playerOneMove = "";

            // loops while player one does not input a valid move
            while (!(playerOneMove.equalsIgnoreCase("R") || playerOneMove.equalsIgnoreCase("P") || playerOneMove.equalsIgnoreCase("S"))) {
                // output and obtain user input for player one move
                System.out.println("Welcome! Player One, please enter your move (R, P, S) or (r, p, s): ");
                playerOneMove = playerOne.nextLine();
                // checks for valid input from player one
                if (!(playerOneMove.equalsIgnoreCase("R") || playerOneMove.equalsIgnoreCase("P") || playerOneMove.equalsIgnoreCase("S"))) {
                    System.out.println("Player One, you entered your move as: " + playerOneMove);
                    System.out.println("Please reenter your move, inputting R, P, or S");
                }
            }

            // clear out player two's move to ensure new entry can be read
            playerTwoMove = "";

            // loops while player one does not input a valid move
            while (!(playerTwoMove.equalsIgnoreCase("R") || playerTwoMove.equalsIgnoreCase("P") || playerTwoMove.equalsIgnoreCase("S"))) {
                // output and obtain user input for player one move
                System.out.println("Player Two, please enter your move (R, P, S) or (r, p, s): ");
                playerTwoMove = playerTwo.nextLine();
                // checks for valid input from player one
                if (!(playerTwoMove.equalsIgnoreCase("R") || playerTwoMove.equalsIgnoreCase("P") || playerTwoMove.equalsIgnoreCase("S"))) {
                    System.out.println("Player Two, you entered your move as: " + playerTwoMove);
                    System.out.println("Please reenter your move, inputting R, P, or S");
                }
            }

            // compare the two inputs/move to see who wins
            // outputs the tie if the two inputs are the same
            if (playerOneMove.equalsIgnoreCase(playerTwoMove)) {
                System.out.println("Player One and Player Two tied with " + playerOneMove + " and " + playerTwoMove);
            } else {
                // checks for first player move first
                if (playerOneMove.equalsIgnoreCase("R")) {
                    // if player one plays rock, second player move is checked
                    if (playerTwoMove.equalsIgnoreCase("P")) {
                        // paper beats rock, player two wins
                        System.out.println("Paper covers rock! Player Two Wins.");
                    } else {
                        // rock beats scissors, player one wins
                        System.out.println("Rock crushes scissors! Player One Wins.");
                    }
                } else if (playerOneMove.equalsIgnoreCase("P")) {
                    // if player one plays paper, second player is checked
                    if (playerTwoMove.equalsIgnoreCase("R")) {
                        // paper covers rock, player one wins
                        System.out.println("Paper covers rock! Player One Wins.");
                    } else {
                        // scissors beats paper, player two wins
                        System.out.println("Scissors cuts paper! Player Two Wins.");
                    }
                } else {
                    // player one plays scissors, checks player two play
                    if (playerTwoMove.equalsIgnoreCase("R")) {
                        // rock crushes scissors, player two wins
                        System.out.println("Rock crushes scissors! Player Two Wins.");
                    } else {
                        // Scissors cuts paper, player one wins
                        System.out.println("Scissors cuts paper! Player One Wins.");
                    }
                }
            }

            // clears user input for playing again to ensure another response can be received
            playAgainInput = "";

            // loops while the user has not inputted proper input and ensures that user will input something valid
            while (!(playAgainInput.equalsIgnoreCase("Y") || playAgainInput.equalsIgnoreCase("N"))) {
                // output and obtain user input for if they want to play again
                System.out.println("Would you like to play again? [Y or N]?");
                // assign user input to variable
                playAgainInput = playAgain.nextLine();
                // checks for if it is a valid input of Y or N or y or n
                if (!(playAgainInput.equalsIgnoreCase("Y") || playAgainInput.equalsIgnoreCase("N"))) {
                    // if not Y, y, N, or n, prompt error message and user tries again
                    System.out.println("You entered " + playAgainInput);
                    System.out.println("That is an invalid input. Please try again and enter Y or N when prompted.");
                }
            }
            // will rerun loop if user inputs Y or y
        } while (playAgainInput.equalsIgnoreCase("Y"));
    }
}