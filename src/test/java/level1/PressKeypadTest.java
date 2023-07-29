package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PressKeypadTest {

    private final PressKeypad problem = new PressKeypad();

    @Test
    void test1() {
        int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
        String hand = "right";
        String expected = "LRLLLRLLRRL";
        String actual = problem.solution(numbers, hand);
        assertEquals(expected, actual);
    }
}