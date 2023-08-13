package level1.약수의_개수와_덧셈;

/*
 * 월간 코드 챌린지 시즌2 - 약수의 개수와 덧셈 (Lv.1)
 *
 * [요구사항]
 * - 주어진 정수 `left`와 `right` 사이의 정수들에 대해
 *   약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 결과를 리턴한다.
 *
 * [제한사항]
 * - 1 ≤ `left` ≤ `right` ≤ 1,000
 */
class Solution {

    // 각 자연수에 대해 약수의 개수를 하나씩 세는 풀이
    public int solution1(int left, int right) {
        int result = 0;
        for (int num = left; num <= right; num++) {
            int divisorCount = countDivisorsOf(num);
            result += (divisorCount % 2 == 0) ? num : -num;
        }
        return result;
    }
    
    // 자연수의 약수의 개수를 계산하는 메서드
    private int countDivisorsOf(int num) {
        int count = 0;
        for (int d = 1; d * d <= num; d++) {
            if (num % d == 0) {
                count++;
                if (d * d != num) {
                    count++;
                }
            }
        }
        return count;
    }
    
    // 완전제곱수의 특성을 이용한 풀이
    public int solution2(int left, int right) {
        int result = 0;
        for (int num = left; num <= right; num++) {
            int sqrt = (int) Math.sqrt(num);
            result += (sqrt * sqrt == num) ? -num : num;
        }
        return result;
    }
}
