package level1;

import java.util.stream.IntStream;

/*
 * 월간 코드 챌린지 시즌3 - 없는 숫자 더하기 (Lv.1)
 *
 * [요구사항]
 * - 0부터 9까지의 정수 중 일부가 들어있는 배열 `numbers`이 매개변수로 주어진다.
 *   `numbers` 안에 없는 0부터 9까지의 숫자의 합을 리턴한다.
 *
 * [제한사항]
 * - 1 ≤ `numbers`의 길이 ≤ 9
 * - 0 ≤ `numbers`의 모든 원소 ≤ 9
 * - `numbers`의 모든 요소는 값이 서로 다르다.
 */
class SumOfMissingNumbers {
    public int solution1(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return 9 * (9 + 1) / 2 - sum;
    }
    
    // Stream을 사용한 풀이
    public int solution2(int[] numbers) {
        return IntStream.rangeClosed(0, 9).sum() - IntStream.of(numbers).sum();
    }
}
