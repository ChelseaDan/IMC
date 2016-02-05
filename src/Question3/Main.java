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
        while (true) {
            Move move = getPlayerMove();

            Move computerMove = computer.getComputerMove();
            Result result = getResult(move, computerMove);

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
                    result = (computerMove == Move.SCISSORS) ? Result.LOSE : Result.WIN;
                    break;
                case PAPER:
                    result = (computerMove == Move.ROCK) ? Result.LOSE : Result.WIN;
                    break;
                case SCISSORS:
                    result = (computerMove == Move.PAPER) ? Result.LOSE : Result.WIN;
                    break;
                default:
                    /* Quit */
                    result = null;
                    System.exit(0);
            }
        }
        return result;
    }

    private static void printResult(Move computerMove, Move move, Result result) {
        System.out.println("Your move was : " + move.toString());
        System.out.println("Computer move was : " + computerMove.toString());
        System.out.println("The result was : " + result.toString());
    }

    public static Move getPlayerMove() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your move: ROCK, PAPER, SCISSORS, Quit(Q)");
        while(true) {
            try {
                return Move.valueOf(input.readLine().toUpperCase());
            } catch (IllegalArgumentException | IOException e) {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }
}
