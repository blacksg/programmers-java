package level1.약수의_합;

/*
 * 연습문제 - 약수의 합 (Lv.1)
 *
 * [요구사항]
 * - 주어진 정수 `n`의 약수의 합을 리턴한다.
 *
 * [제한사항]
 * - `n`은 0 이상 3000 이하인 정수다.
 */
class Solution {

    public int solution(int n) {
        int sum = 0;
        for (int d = 1; d * d <= n; d++) {
            if (n % d == 0) {
                sum += d;
                if (d * d != n) {
                    sum += n / d;
                }
            }
        }
        return sum;
    }
}
