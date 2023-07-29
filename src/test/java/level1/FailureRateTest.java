package level1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FailureRateTest {

    private final FailureRate problem = new FailureRate();

    @Test
    void test1() {
        int n = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
        int[] expected = { 3, 4, 2, 1, 5 };
        int[] actual = problem.solution(n, stages);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        int n = 4;
        int[] stages = { 4, 4, 4, 4, 4 };
        int[] expected = { 4, 1, 2, 3 };
        int[] actual = problem.solution(n, stages);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        int n = 6;
        int[] stages = { 3, 4, 2, 1, 5 };
        int[] expected = { 5, 4, 3, 2, 1, 6 };
        int[] actual = problem.solution(n, stages);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}