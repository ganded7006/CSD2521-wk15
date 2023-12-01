/* Adding a comment at the top of the code file.

/*
* Name: Duane Gandelot
* Date: 11/21/23
* Purpose: Enhance the hangman game so it displays a hangman (graphic).
*          Also update the game to only have 7 wrong guesses.
*/

import java.util.Scanner;

public class HangmanApp {

    public static void main(String[] args) {
        System.out.println("Play the H A N G M A N game");
        
        Scanner sc = new Scanner(System.in);        
        String again = "y";        
        while(again.equalsIgnoreCase("y")) {
            var hangman = new Hangman();
            hangman.drawHangman(7);
            hangman.playGame();
            System.out.println();
            System.out.print("Play again? (y/n): ");
            again = sc.nextLine();
        }
    } 
}