package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CraneGameTest {

    private final CraneGame problem = new CraneGame();

    @Test
    void test1() {
        int[][] board = {
            { 0, 0, 0, 0, 0 },
            { 0, 0, 1, 0, 3 },
            { 0, 2, 5, 0, 1 },
            { 4, 2, 4, 4, 2 },
            { 3, 5, 1, 3, 1 }
        };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
        assertEquals(4, problem.solution(board, moves));
    }
}