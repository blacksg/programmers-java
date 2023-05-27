package level1;

/*
 * 연습문제 - 약수의 합 (Lv.1)
 *
 * [요구사항]
 * - 정수 n을 입력받아 n의 약수의 합을 리턴한다.
 *
 * [제한사항]
 * - n은 0 이상 3000 이하인 정수다.
 */
class SumOfDivisors {
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
