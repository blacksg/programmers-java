package level1.최소직사각형;

import java.util.Arrays;

/*
 * 완전탐색 - 최소직사각형 (Lv.1)
 *
 * [요구사항]
 * - 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 `sizes`가 매개변수로 주어진다.
 *   모든 명함을 수납할 수 있는 가장 작은 지갑의 크기를 리턴한다.
 *
 * [제한사항]
 * - 1 ≤ `sizes`의 길이 ≤ 10000
 * - `sizes`의 요소는 [가로 길이, 세로 길이] 형식이다.
 * - 1 ≤ 명함의 가로 또는 세로 길이 ≤ 1000
 */
class Solution {

    public int solution1(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (int[] size : sizes) {
            maxWidth = Math.max(maxWidth, Math.max(size[0], size[1]));
            maxHeight = Math.max(maxHeight, Math.max(size[0], size[1]));
        }
        return maxWidth * maxHeight;
    }
    
    // Stream을 사용한 풀이
    public int solution2(int[][] sizes) {
        return Arrays.stream(sizes)
            .reduce((acc, size) -> new int[]{
                Math.max(Math.max(acc[0], acc[1]), Math.max(size[0], size[1])),
                Math.max(Math.min(acc[0], acc[1]), Math.min(size[0], size[1])),
            })
            .map(size -> size[0] * size[1])
            .orElse(0);
    }
}
