package level1.두_개_뽑아서_더하기;

import java.util.TreeSet;

/*
 * 월간 코드 챌린지 시즌1 - 두 개 뽑아서 더하기 (Lv.1)
 *
 * [요구사항]
 * - 주어진 정수 배열 `numbers`에서
 *   서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
 *   배열에 오름차순으로 담아 리턴해야 한다.
 *
 * [제한사항]
 * - `numbers`의 길이는 2 이상 100 이하다.
 * - `numbers`의 모든 수는 0 이상 100 이하다.
 */
class Solution {

    public int[] solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                treeSet.add(numbers[i] + numbers[j]);
            }
        }
        return treeSet.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
