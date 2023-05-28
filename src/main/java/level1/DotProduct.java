package level1;

import java.util.stream.IntStream;

/*
 * 월간 코드 챌린지 시즌1 - 내적 (Lv.1)
 *
 * [요구사항]
 * - 길이가 같은 두 1차원 정수 배열 `a`, `b`의 내적을 리턴한다.
 * - `a`와 `b`의 내적은 같은 인덱스에 위치한 각 요소의 곱을 합한 것과 같다.
 *
 * [제한사항]
 * - `a`, `b`의 길이는 1 이상 1,000 이하다.
 * - `a`, `b`의 모든 요소는 -1,000 이상 1,000 이하의 정수다.
 */
class DotProduct {
    public int solution1(int[] a, int[] b) {
        int product = 0;
        for (int i = 0; i < a.length; i++) {
            product += a[i] * b[i];
        }
        return product;
    }
    
    // Stream을 사용한 풀이
    public int solution2(int[] a, int[] b) {
        return IntStream.range(0, a.length).reduce(
            0,
            (product, index) -> product + a[index] * b[index]
        );
    }
}
