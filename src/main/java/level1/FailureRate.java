package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * [Lv.1] 2019 KAKAO BLIND RECRUITMENT - 실패율
 *
 * [요구사항]
 * - 게임 내 스테이지의 실패율은 다음과 같이 정의한다.
 *   - 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
 *   전체 스테이지 수가 `n`, 사용자가 멈춰있는 스테이지 번호가 담긴 배열 `stages`가 주어졌을 때,
 *   스테이지 번호를 실패율 기준 내림차순으로 정렬한 배열을 리턴한다.
 *
 * [제한사항]
 * - `n`은 1 이상 500 이하의 자연수다.
 * - `stages`의 길이는 1 이상 200000 이하다.
 * - `stages`의 각 요소는 1 이상 `n` + 1 이하의 자연수다.
 *   - `n` + 1은 마지막 스테이지를 클리어함을 의미한다.
 * - 실패율이 같은 경우 스테이지 번호가 작은 쪽을 우선한다.
 * - 어떠한 스테이지에 도달한 사용자가 없는 경우 해당 스테이지의 실패율은 0으로 간주한다.
 */
class FailureRate {

    public int[] solution(int n, int[] stages) {
        int[] stoppedUsers = new int[n + 2];
        for (int stage : stages) {
            stoppedUsers[stage]++;
        }

        int[] reachedUsers = Arrays.copyOf(stoppedUsers, stoppedUsers.length);
        for (int i = reachedUsers.length - 2; i > 0; i--) {
            reachedUsers[i] += reachedUsers[i + 1];
        }

        double[] failureRates = IntStream.rangeClosed(1, n)
            .mapToDouble(i -> (reachedUsers[i] == 0) ? 0 : (double) stoppedUsers[i] / reachedUsers[i])
            .toArray();

        return IntStream.rangeClosed(1, n)
            .boxed()
            .sorted((Integer i1, Integer i2) -> {
                int result = Double.compare(failureRates[i2 - 1], failureRates[i1 - 1]);
                return (result == 0) ? i1.compareTo(i2) : result;
            })
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
