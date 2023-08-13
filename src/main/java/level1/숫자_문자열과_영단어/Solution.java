package level1.숫자_문자열과_영단어;

/*
 * 2021 카카오 채용연계형 인턴십 - 숫자 문자열과 영단어 (Lv.1)
 *
 * [요구사항]
 * - 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 `s`가 매개변수로 주어진다.
 *   `s`가 의미하는 원래 숫자를 리턴해야 한다.
 * - 각 숫자에 대응하는 영단어는 다음과 같다.
 *   - 0: "zero"
 *   - 1: "one"
 *   - 2: "two"
 *   - 3: "three"
 *   - 4: "four"
 *   - 5: "five"
 *   - 6: "six"
 *   - 7: "seven"
 *   - 8: "eight"
 *   - 9: "nine"
 *
 * [제한사항]
 * - 1 ≤ `s`의 길이 ≤ 50
 * - `s`가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않는다.
 * - 리턴값이 1 이상 2000000000 이하의 정수가 되는 올바른 입력만 주어진다.
 */
class Solution {

    public int solution(String s) {
        String[] words = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };
        for (int number = 0; number < words.length; number++) {
            s = s.replace(words[number], Integer.toString(number));
        }
        return Integer.parseInt(s);
    }
}
