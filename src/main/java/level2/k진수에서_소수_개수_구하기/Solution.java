package level2.k진수에서_소수_개수_구하기;

/*
 * [Lv.2] 2022 KAKAO BLIND RECRUITMENT - k진수에서 소수 개수 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/92335
 */
class Solution {

    public int solution(int n, int k) {
        String[] numbers = Integer.toString(n, k).split("0");
        int result = 0;
        for (String number : numbers) {
            if (number.length() > 0 && isPrime(Long.parseLong(number))) {
                result++;
            }
        }
        return result;
    }

    private boolean isPrime(long number) {
        if (number == 2) {
            return true;
        }
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
