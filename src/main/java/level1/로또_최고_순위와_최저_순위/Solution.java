package level1.로또_최고_순위와_최저_순위;

/*
 * [Lv.1] 2021 Dev-Matching: 웹 백엔드 개발자(상반기) - 로또의 최고 순위와 최저 순위
 *
 * [요구사항]
 * - 1부터 45까지의 숫자 중 6개를 선택하여 맞추는 복권이 있다.
 *   이 복권은 다음과 같이 순위를 정한다.
 *   - 1순위: 6개 숫자가 모두 일치
 *   - 2순위: 5개 숫자가 일치
 *   - 3순위: 4개 숫자가 일치
 *   - 4순위: 3개 숫자가 일치
 *   - 5순위: 2개 숫자가 일치
 *   - 6순위: 1개 이하의 숫자가 일치
 * - 구매한 복권의 숫자 중 일부가 0으로 표시되어 있다.
 * - 구매한 복권 숫자가 담긴 배열 `lottos`, 당첨 번호가 담긴 배열 `winNums`가 주어질 때,
 *   당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 리턴한다.
 *
 * [제한사항]
 * - 당첨 순위는 선택한 숫자의 순서와 상관없다.
 * - `lottos`의 길이는 6이다.
 * - `lottos`의 각 요소는 0 이상 45 이하의 정수다.
 * - 0을 제외한 요소는 중복되지 않는다.
 * - `lottos`는 정렬 상태를 보장하지 않는다.
 * - `winNums`의 길이는 6이다.
 * - `winNums`의 각 요소는 1 이상 45 이하의 정수다.
 */
class Solution {

    public int[] solution(int[] lottos, int[] winNums) {
        int wins = 0;
        int zeros = 0;
        for (int num : lottos) {
            if (num == 0) {
                zeros++;
            }
            for (int winNum : winNums) {
                if (winNum == num) {
                    wins++;
                }
            }
        }
        return new int[] { evaluateRanking(wins + zeros), evaluateRanking(wins) };
    }

    private int evaluateRanking(int matched) {
        if (matched > 1) {
            return 6 - matched + 1;
        }
        return 6;
    }
}
