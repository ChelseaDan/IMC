package Question3;

import java.util.Random;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Computer {

    /*Representing Rock, Paper and Scissors.*/
    private static int POSSIBLE_MOVES = 3;
    /*Create an array with all the possible moves*/
    private Move[] moves = Move.values();

    public Move getComputerMove() {
        Random random = new Random();
        /*Generate a random number between 0 and POSSIBLE_MOVES
        * and return the Move in the moves array. Q must be last and
        * therefore POSSIBLE_MOVES must be 1 less than the number of
        * enums. But this allows for easier modification if we want to
        * make Rock, Paper, Scissors, Lizard, Spock for example.*/
        return moves[random.nextInt(POSSIBLE_MOVES)];
    }


}
