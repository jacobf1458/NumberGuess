/**
 * Created by jacob on 9/26/17.
 */

import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {

        int guess = 0;
        int num = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Guess a number between 1 and 10: ");
        num = rand.nextInt(11) + 1;
        guess = scan.nextInt();

        if (num == guess){
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly.\nThe number was " + num);
        }
    }
}
