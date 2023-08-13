package level1.나머지가_1이_되는_수_찾기;

/*
 * 월간 코드 챌린지 시즌3 - 나머지가 1이 되는 수 찾기 (Lv.1)
 *
 * [요구사항]
 * - 주어진 자연수 `n`을 `x`로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 `x`를 리턴한다.
 * - 답은 항상 존재한다.
 *
 * [제한사항]
 * - `n`은 3 이상 1000000 이하의 자연수다.
 */
class Solution {

    public int solution(int n) {
        for (int d = 2; d * d <= n - 1; d++) {
            if (n % d == 1) {
                return d;
            }
        }
        return n - 1;
    }
}
