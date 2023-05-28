package level1;

import java.util.stream.IntStream;

/*
 * 연습문제 - 평균 구하기 (Lv.1)
 *
 * [요구사항]
 * - int 배열 `arr`의 평균값을 리턴한다.
 *
 * [제한사항]
 * - `arr`의 길이는 1 이상 100 이하다.
 * - `arr`의 요소는 -10000 이상 10000 이하의 정수다.
 */
class Average {
    public double solution1(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
    // Stream을 사용한 풀이
    public double solution2(int[] arr) {
        return IntStream.of(arr)
            .average()
            .orElse(0);
    }
}
