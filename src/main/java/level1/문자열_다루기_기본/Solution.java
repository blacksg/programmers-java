package level1.문자열_다루기_기본;

/*
 * 연습문제 - 문자열 다루기 기본 (Lv.1)
 *
 * [요구사항]
 * - 문자열 `s`의 길이가 4 또는 6이며 숫자로만 구성되어 있는지 여부를 리턴한다.
 *
 * [제한사항]
 * - 1 ≤ `s`의 길이 ≤ 8
 * - `s`는 알파벳 또는 숫자로 이루어져 있다.
 */
class Solution {

    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("\\d+");
    }
}
