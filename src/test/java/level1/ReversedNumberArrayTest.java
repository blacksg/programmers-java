package level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedNumberArrayTest {

    private final ReversedNumberArray problem = new ReversedNumberArray();

    @Test
    void test1() {
        long n = 12345;
        int[] expected = { 5, 4, 3, 2, 1 };
        int[] actual = problem.solution(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        long n = 12040;
        int[] expected = { 0, 4, 0, 2, 1 };
        int[] actual = problem.solution(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        long n = 12005;
        int[] expected = { 5, 0, 0, 2, 1 };
        int[] actual = problem.solution(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test4() {
        long n = 10305;
        int[] expected = { 5, 0, 3, 0, 1 };
        int[] actual = problem.solution(n);
        assertArrayEquals(expected, actual);
    }

    @Test
    void test5() {
        long n = 100_0000_0000L;
        int[] expected = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int[] actual = problem.solution(n);
        assertArrayEquals(expected, actual);
    }
}