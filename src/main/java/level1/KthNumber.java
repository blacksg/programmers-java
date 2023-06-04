package level1;

import java.util.Arrays;

/*
 * 정렬 - K번째 수 (Lv.1)
 *
 * [요구사항]
 * - 1차원 배열 `array`와 2차원 배열 `commands`가 매개변수로 주어질 때,
 *   `commands`의 각 요소에 대해 다음 연산을 수행한 결과를 배열에 담아 리턴해야 한다.
 * - `commands`의 요소는 [`i`, `j`, `k`]의 형식이다.
 *   `array`의 `i`번째 요소부터 `j`번째 요소 이전까지 자른 배열을 정렬한 뒤, `k`번째 요소를 반환한다.
 *
 * [제한사항]
 * - 1 ≤ `array`의 길이 ≤ 100
 * - 1 ≤ `array`의 각 요소 ≤ 100
 * - 1 ≤ `commands`의 길이 ≤ 50
 */
class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] subArray = Arrays.copyOfRange(
                array,
                commands[i][0] - 1,
                commands[i][1]
            );
            Arrays.sort(subArray);
            result[i] = subArray[commands[i][2] - 1];
        }
        return result;
    }
}
