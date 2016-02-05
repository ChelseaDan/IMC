package Question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---Welcome to RockPaperScissors---");
        label:while (true) {
            System.out.println("Please enter your move: ROCK(R), PAPER(P), SCISSORS(S), Quit(Q)");
            try {
                String move = input.readLine();
                Move playerMove;

                switch (move) {
                    case "R": playerMove = Move.ROCK; break;
                    case "P": playerMove = Move.PAPER; break;
                    case "S": playerMove = Move.SCISSORS; break;
                    case "Q": break label;
                    default: continue label;
                }

                Move compMove = computer.getComputerMove();
                Result result = playerResult(playerMove, compMove);
                System.out.println("Your move was : " + playerMove.toString());
                System.out.println("Computer move was : " + compMove.toString());
                System.out.println("The result was : " + result.toString());
            } catch (IOException e) {
                System.out.println(e.getStackTrace());
            }
        }

    }

    public static Result playerResult(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            return Result.DRAW;
        }
        switch (playerMove) {
            case PAPER:
                return (computerMove == Move.SCISSORS) ? Result.LOSE : Result.WIN;
            case SCISSORS:
                return (computerMove == Move.ROCK) ? Result.LOSE : Result.WIN;
            case ROCK:
                return (computerMove == Move.PAPER) ? Result.LOSE : Result.WIN;
            default:
                return null;
        }
    }

}
