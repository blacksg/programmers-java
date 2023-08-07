package level1;

/*
 * [Lv.1] 연습문제 - 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java
 */
class ReversedNumberArray {

    public int[] solution(long n) {
        int digitCount = 0;
        long remainingDigits = n;
        while (remainingDigits > 0) {
            digitCount++;
            remainingDigits /= 10;
        }

        int[] result = new int[digitCount];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (n % 10);
            n /= 10;
        }

        return result;
    }
}
