package Question3;

import java.util.Random;

/**
 * Created by dg1613 on 05/02/16.
 */
public class Computer {

    public Move getComputerMove() {
        Random random = new Random();
        Move[] moves = Move.values();
        return moves[random.nextInt(3)];
    }


}
