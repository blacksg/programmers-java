package level1;

import java.util.stream.IntStream;

/*
 * 월간 코드 챌린지 시즌2 - 음양 더하기 (Lv.1)
 *
 * [요구사항]
 * - 정수의 절댓값이 담긴 배열 `absolutes`와 부호가 담긴 배열 `signs`에 대해
 *   실제 정수들의 합을 구하여 리턴한다.
 *
 * [제한사항]
 * - `absolutes`의 길이는 1 이상 1,000 이하다.
 * - `absolutes` 안의 모든 절댓값은 1 이상 1,000 이하다.
 * - `signs`의 길이는 `absolutes`의 길이와 같다.
 * - `signs[i]`가 `true`이면 부호가 양, 그렇지 않으면 음이라는 의미다.
 */
class SumOfSignedNumbers {
    public int solution1(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return sum;
    }
    
    // Stream을 사용한 풀이
    public int solution2(int[] absolutes, boolean[] signs) {
        return IntStream.range(0, absolutes.length)
            .reduce(0, (sum, i) -> sum + (signs[i] ? absolutes[i] : -absolutes[i]));
    }
}
