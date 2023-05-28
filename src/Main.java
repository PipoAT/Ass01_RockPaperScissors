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