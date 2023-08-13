package level1.수박수박수박수박수박수;

/*
 * 연습문제 - 수박수박수박수박수박수? (Lv.1)
 *
 * [요구사항]
 * - "수박수박수..."와 같은 패턴을 유지하고 길이가 `n`인 문자열을 리턴한다.
 *
 * [제한사항]
 * - `n`은 10000 이하의 자연수다.
 */
class Solution {

    public String solution1(int n) {
        String result = "수박".repeat(n / 2);
        if (n % 2 != 0) {
            result += "수";
        }
        return result;
    }
    
    // `java.lang.StringBuilder`를 사용한 풀이
    public String solution2(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            builder.append("수박");
        }
        if (n % 2 != 0) {
            builder.append("수");
        }
        return builder.toString();
    }
}
