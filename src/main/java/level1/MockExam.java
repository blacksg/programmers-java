package level1;

import java.util.Arrays;

/*
 * 완전탐색 - 모의고사 (Lv.1)
 *
 * [요구사항]
 * - 수포자 삼인방은 각자 모의고사의 수학 문제를 다음과 같이 전부 찍으려 한다.
 *   1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 *   2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 *   3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * - 1번 문제부터 마지막 문제까지의 정답이 순서대로 들어있는 배열 `answers`가 주어졌을 때,
 *   가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 리턴해야 한다.
 *
 * [제한사항]
 * - 시험은 최대 10000 문제로 구성되어 있다.
 * - 문제의 정답은 1 ~ 5 중 하나다.
 * - 가장 높은 점수를 받은 사람이 여러 명일 경우, 리턴하는 배열을 오름차순 정렬해야 한다.
 */
class MockExam {
    public int[] solution(int[] answers) {
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] counts = new int[patterns.length];
        for (int i = 0; i < patterns.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (patterns[i][j % patterns[i].length] == answers[j]) {
                    counts[i]++;
                }
            }
        }
        
        int maxCount = 0;
        for (int count : counts) {
            maxCount = Math.max(maxCount, count);
        }
        
        int[] result = new int[]{};
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = i + 1;
            }
        }
        
        return result;
    }
}
