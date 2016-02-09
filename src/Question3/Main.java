package Question3;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        gameLoop();
    }

    private static void gameLoop() {

        Computer computer = new Computer();
        System.out.println("---Welcome to RockPaperScissors---");
        /*Game loop that runs until the user inputs 'Q' to quit.*/
        while (true) {
            /*Get the player's move.*/
            Move move = getPlayerMove();

            /*Get the computer's move.*/
            Move computerMove = computer.getComputerMove();

            /*Calculate the result.*/
            Result result = getResult(move, computerMove);

            /*Print the result to the terminal.*/
            printResult(computerMove, move, result);
        }
    }

    private static Result getResult(Move move, Move computerMove) {

        Result result;

        if (move == computerMove) {
            result = Result.DRAW;
        } else {
            switch (move) {
                case ROCK:
                    result = (computerMove == Move.SCISSORS) ? Result.WIN : Result.LOSE;
                    break;
                case PAPER:
                    result = (computerMove == Move.ROCK) ? Result.WIN : Result.LOSE;
                    break;
                case SCISSORS:
                    result = (computerMove == Move.PAPER) ? Result.WIN : Result.LOSE;
                    break;
                default:
                    /* Quit */
                    result = null;
                    System.exit(0);
            }
        }
        return result;
    }

    /*Takes the computer's move and the players move and the result and prints them to the console.*/
    private static void printResult(Move computerMove, Move move, Result result) {
        System.out.println("Your move was : " + move.toString());
        System.out.println("Computer move was : " + computerMove.toString());
        System.out.println("The result was : " + result.toString());
        System.out.println();
    }

    /*Asks the user to enter their move, if the move is valid then we return from the method and the
    * players move is set. Else the user is asked to enter a valid move.*/
    public static Move getPlayerMove() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                System.out.println("Please enter your move: ROCK, PAPER, SCISSORS, Quit(Q)");
                return Move.valueOf(input.readLine().toUpperCase());
            } catch (IllegalArgumentException | IOException e) {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }
}
